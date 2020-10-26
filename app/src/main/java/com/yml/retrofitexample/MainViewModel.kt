package com.yml.retrofitexample

class MainViewModel {
    var repositoryClass: RepositoryClass ?= null
    fun getComments(viewCallBack: ViewCallBack){
        repositoryClass = RepositoryClass()
        repositoryClass?.getComments(object : APIResponseInterface{
            override fun onResponse(response: List<ResponseObjects>) {
                viewCallBack.onApiSuccess(response)
            }

            override fun onFailure() {
                TODO("Not yet implemented")
            }

        })
    }

    fun getPosts(viewCallBack: ViewCallBack){
        repositoryClass = RepositoryClass()
        repositoryClass?.getPosts(object : APIResponseInterface{
            override fun onResponse(response: List<ResponseObjects>) {
                viewCallBack.onApiSuccess(response)
            }

            override fun onFailure() {
                TODO("Not yet implemented")
            }

        })
    }

    fun getTodos(viewCallBack: ViewCallBack){
        repositoryClass = RepositoryClass()
        repositoryClass?.getTodos(object : APIResponseInterface{
            override fun onResponse(response: List<ResponseObjects>) {
                viewCallBack.onApiSuccess(response)
            }
            override fun onFailure() {
                TODO("Not yet implemented")
            }
        })
    }

    fun getAlbums(viewCallBack: ViewCallBack){
        repositoryClass = RepositoryClass()
        repositoryClass?.getAlbums(object : APIResponseInterface{
            override fun onResponse(response: List<ResponseObjects>) {
                viewCallBack.onApiSuccess(response)
            }
            override fun onFailure() {
                TODO("Not yet implemented")
            }
        })
    }
}