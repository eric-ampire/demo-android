package com.ericampire.android.ktordemo.ui.repository

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.airbnb.epoxy.*
import com.airbnb.epoxy.preload.ViewData
import com.airbnb.epoxy.preload.ViewMetadata
import com.ericampire.android.ktordemo.CarouselItemBindingModel_
import com.ericampire.android.ktordemo.R
import com.ericampire.android.ktordemo.carouselItem
import com.ericampire.android.ktordemo.databinding.ViewHolderRepositoryBinding
import com.ericampire.android.ktordemo.entity.Repository
import com.ericampire.android.ktordemo.repository
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ListRepoFragment : Fragment(R.layout.fragment_repository) {

    private val viewModel by viewModels<ListRepoViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rv = view.findViewById<EpoxyRecyclerView>(R.id.rvListData)

        viewModel.fetchRepository()
        viewModel.data.observe(viewLifecycleOwner) { data ->
            rv.withModels {
                val carouselItems = (1..20).map {
                    CarouselItemBindingModel_()
                        .id(it)
                        .clickListener { view -> Toast.makeText(requireContext(), "Clicked", Toast.LENGTH_LONG).show() }
                        .theText("$it")

                }

                carousel {
                    id("recent")
                    models(carouselItems)
                }
                data?.forEach {
                    repository {
                        id(it.id)
                        repository(it)
                    }
                }
            }
        }
    }
}

class RepositoryController : TypedEpoxyController<List<Repository>>() {

    override fun buildModels(data: List<Repository>?) {
        carousel {
            id("recen")
            padding(Carousel.Padding.dp(0, 4, 0, 16, 8))
            hasFixedSize(true)
            data?.forEach {
                repository {
                    id(it.id)
                    repository(it)
                }
            }
        }
       data?.forEach {
           repository {
               id(it.id)
               repository(it)
           }
       }


    }
}