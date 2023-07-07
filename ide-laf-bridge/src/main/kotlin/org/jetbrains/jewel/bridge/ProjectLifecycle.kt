package org.jetbrains.jewel.bridge

import com.intellij.openapi.Disposable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel

internal class ProjectLifecycle : Disposable, CoroutineScope {

    override val coroutineContext = SupervisorJob()

    override fun dispose() = cancel()
}
