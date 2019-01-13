package com.beyazidyargici.pokeinfo.util

import kotlinx.coroutines.*

/**
 *  Created by beyazid on 12.01.2019.
 */

fun <T> lazyDeferred(block: suspend CoroutineScope.() -> T) : Lazy<Deferred<T>>{
    return lazy {
        GlobalScope.async(start = CoroutineStart.LAZY) {
            block.invoke(this)
        }
    }
}