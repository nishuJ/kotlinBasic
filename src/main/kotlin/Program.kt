import com.sg.kotlin.Providers

fun main(args: Array<String>) {
 //val providers = Providers()
 val allProviders = Providers.getProviders()
    val it = allProviders.iterator()
    while(it.hasNext()){
        val provider = it.next()
        println(provider.name)

        provider.forEach { key, value -> println("\t$key: $value")  }
    }
}

fun listProviders(){
    val providers = getProviders()
    val it = providers.iterator()
    while(it.hasNext()){
        val provider = it.next()
        println(provider.name)

        provider.forEach { key, value -> println("\t$key: $value")  }
    }
}