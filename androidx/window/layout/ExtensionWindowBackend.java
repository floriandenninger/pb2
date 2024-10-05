package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.window.core.Version;
import androidx.window.layout.ExtensionInterfaceCompat;
import androidx.window.layout.ExtensionWindowBackend;
import defpackage.azsh;
import defpackage.azuj;
import defpackage.azul;
import defpackage.hw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ExtensionWindowBackend implements WindowBackend {
    public static final boolean DEBUG = false;
    private static final String TAG = "WindowServer";
    private static volatile ExtensionWindowBackend globalInstance;
    private ExtensionInterfaceCompat windowExtension;
    private final CopyOnWriteArrayList windowLayoutChangeCallbacks;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock globalLock = new ReentrantLock();

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(azuj azujVar) {
            this();
        }

        public final ExtensionWindowBackend getInstance(Context context) {
            context.getClass();
            if (ExtensionWindowBackend.globalInstance == null) {
                ReentrantLock reentrantLock = ExtensionWindowBackend.globalLock;
                reentrantLock.lock();
                try {
                    if (ExtensionWindowBackend.globalInstance == null) {
                        ExtensionWindowBackend.globalInstance = new ExtensionWindowBackend(ExtensionWindowBackend.Companion.initAndVerifyExtension(context));
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            ExtensionWindowBackend extensionWindowBackend = ExtensionWindowBackend.globalInstance;
            extensionWindowBackend.getClass();
            return extensionWindowBackend;
        }

        public final ExtensionInterfaceCompat initAndVerifyExtension(Context context) {
            context.getClass();
            try {
                if (!isSidecarVersionSupported(SidecarCompat.Companion.getSidecarVersion())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (sidecarCompat.validateExtensionInterface()) {
                    return sidecarCompat;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final boolean isSidecarVersionSupported(Version version) {
            return version != null && version.compareTo(Version.Companion.getVERSION_0_1()) >= 0;
        }

        public final void resetInstance() {
            ExtensionWindowBackend.globalInstance = null;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class ExtensionListenerImpl implements ExtensionInterfaceCompat.ExtensionCallbackInterface {
        final /* synthetic */ ExtensionWindowBackend this$0;

        public ExtensionListenerImpl(ExtensionWindowBackend extensionWindowBackend) {
            extensionWindowBackend.getClass();
            this.this$0 = extensionWindowBackend;
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        public void onWindowLayoutChanged(Activity activity, WindowLayoutInfo windowLayoutInfo) {
            activity.getClass();
            windowLayoutInfo.getClass();
            Iterator it = this.this$0.getWindowLayoutChangeCallbacks().iterator();
            while (it.hasNext()) {
                WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = (WindowLayoutChangeCallbackWrapper) it.next();
                if (azul.c(windowLayoutChangeCallbackWrapper.getActivity(), activity)) {
                    windowLayoutChangeCallbackWrapper.accept(windowLayoutInfo);
                }
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class WindowLayoutChangeCallbackWrapper {
        private final Activity activity;
        private final hw callback;
        private final Executor executor;
        private WindowLayoutInfo lastInfo;

        public WindowLayoutChangeCallbackWrapper(Activity activity, Executor executor, hw hwVar) {
            activity.getClass();
            executor.getClass();
            hwVar.getClass();
            this.activity = activity;
            this.executor = executor;
            this.callback = hwVar;
        }

        public final void accept(final WindowLayoutInfo windowLayoutInfo) {
            windowLayoutInfo.getClass();
            this.lastInfo = windowLayoutInfo;
            this.executor.execute(new Runnable() { // from class: androidx.window.layout.ExtensionWindowBackend$WindowLayoutChangeCallbackWrapper$accept$1
                @Override // java.lang.Runnable
                public final void run() {
                    ExtensionWindowBackend.WindowLayoutChangeCallbackWrapper.this.getCallback().accept(windowLayoutInfo);
                }
            });
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public final hw getCallback() {
            return this.callback;
        }

        public final WindowLayoutInfo getLastInfo() {
            return this.lastInfo;
        }

        public final void setLastInfo(WindowLayoutInfo windowLayoutInfo) {
            this.lastInfo = windowLayoutInfo;
        }
    }

    public ExtensionWindowBackend(ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
        if (extensionInterfaceCompat != null) {
            extensionInterfaceCompat.setExtensionCallback(new ExtensionListenerImpl(this));
        }
        this.windowLayoutChangeCallbacks = new CopyOnWriteArrayList();
    }

    private final void callbackRemovedForActivity(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (azul.c(((WindowLayoutChangeCallbackWrapper) it.next()).getActivity(), activity)) {
                    return;
                }
            }
        }
        ExtensionInterfaceCompat extensionInterfaceCompat = this.windowExtension;
        if (extensionInterfaceCompat == null) {
            return;
        }
        extensionInterfaceCompat.onWindowLayoutChangeListenerRemoved(activity);
    }

    public static /* synthetic */ void getWindowLayoutChangeCallbacks$annotations() {
    }

    private final boolean isActivityRegistered(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (azul.c(((WindowLayoutChangeCallbackWrapper) it.next()).getActivity(), activity)) {
                return true;
            }
        }
        return false;
    }

    public final ExtensionInterfaceCompat getWindowExtension() {
        return this.windowExtension;
    }

    public final CopyOnWriteArrayList getWindowLayoutChangeCallbacks() {
        return this.windowLayoutChangeCallbacks;
    }

    @Override // androidx.window.layout.WindowBackend
    public void registerLayoutChangeCallback(Activity activity, Executor executor, hw hwVar) {
        WindowLayoutInfo windowLayoutInfo;
        Object obj;
        activity.getClass();
        executor.getClass();
        hwVar.getClass();
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            ExtensionInterfaceCompat windowExtension = getWindowExtension();
            if (windowExtension == null) {
                hwVar.accept(new WindowLayoutInfo(azsh.a));
                return;
            }
            boolean isActivityRegistered = isActivityRegistered(activity);
            WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = new WindowLayoutChangeCallbackWrapper(activity, executor, hwVar);
            getWindowLayoutChangeCallbacks().add(windowLayoutChangeCallbackWrapper);
            if (!isActivityRegistered) {
                windowExtension.onWindowLayoutChangeListenerAdded(activity);
            } else {
                Iterator it = getWindowLayoutChangeCallbacks().iterator();
                while (true) {
                    windowLayoutInfo = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (azul.c(activity, ((WindowLayoutChangeCallbackWrapper) obj).getActivity())) {
                            break;
                        }
                    }
                }
                WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper2 = (WindowLayoutChangeCallbackWrapper) obj;
                if (windowLayoutChangeCallbackWrapper2 != null) {
                    windowLayoutInfo = windowLayoutChangeCallbackWrapper2.getLastInfo();
                }
                if (windowLayoutInfo != null) {
                    windowLayoutChangeCallbackWrapper.accept(windowLayoutInfo);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setWindowExtension(ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
    }

    @Override // androidx.window.layout.WindowBackend
    public void unregisterLayoutChangeCallback(hw hwVar) {
        hwVar.getClass();
        synchronized (globalLock) {
            if (getWindowExtension() == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = getWindowLayoutChangeCallbacks().iterator();
            while (it.hasNext()) {
                WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = (WindowLayoutChangeCallbackWrapper) it.next();
                if (windowLayoutChangeCallbackWrapper.getCallback() == hwVar) {
                    windowLayoutChangeCallbackWrapper.getClass();
                    arrayList.add(windowLayoutChangeCallbackWrapper);
                }
            }
            getWindowLayoutChangeCallbacks().removeAll(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                callbackRemovedForActivity(((WindowLayoutChangeCallbackWrapper) it2.next()).getActivity());
            }
        }
    }
}
