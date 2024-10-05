package androidx.window.layout;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.core.Version;
import androidx.window.layout.ExtensionInterfaceCompat;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.azsh;
import defpackage.azuj;
import defpackage.azul;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SidecarCompat implements ExtensionInterfaceCompat {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SidecarCompat";
    private final Map componentCallbackMap;
    private ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback;
    private final SidecarInterface sidecar;
    private final SidecarAdapter sidecarAdapter;
    private final Map windowListenerRegisteredContexts;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(azuj azujVar) {
            this();
        }

        public final IBinder getActivityWindowToken$window_release(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final Version getSidecarVersion() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return Version.Companion.parse(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class DistinctElementCallback implements ExtensionInterfaceCompat.ExtensionCallbackInterface {
        private final WeakHashMap activityWindowLayoutInfo;
        private final ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface;
        private final ReentrantLock lock;

        public DistinctElementCallback(ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface) {
            extensionCallbackInterface.getClass();
            this.callbackInterface = extensionCallbackInterface;
            this.lock = new ReentrantLock();
            this.activityWindowLayoutInfo = new WeakHashMap();
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        public void onWindowLayoutChanged(Activity activity, WindowLayoutInfo windowLayoutInfo) {
            activity.getClass();
            windowLayoutInfo.getClass();
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (azul.c(windowLayoutInfo, (WindowLayoutInfo) this.activityWindowLayoutInfo.get(activity))) {
                    return;
                }
                reentrantLock.unlock();
                this.callbackInterface.onWindowLayoutChanged(activity, windowLayoutInfo);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {
        private final SidecarInterface.SidecarCallback callbackInterface;
        private SidecarDeviceState lastDeviceState;
        private final ReentrantLock lock;
        private final WeakHashMap mActivityWindowLayoutInfo;
        private final SidecarAdapter sidecarAdapter;

        public DistinctSidecarElementCallback(SidecarAdapter sidecarAdapter, SidecarInterface.SidecarCallback sidecarCallback) {
            sidecarAdapter.getClass();
            sidecarCallback.getClass();
            this.sidecarAdapter = sidecarAdapter;
            this.callbackInterface = sidecarCallback;
            this.lock = new ReentrantLock();
            this.mActivityWindowLayoutInfo = new WeakHashMap();
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            sidecarDeviceState.getClass();
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.sidecarAdapter.isEqualSidecarDeviceState(this.lastDeviceState, sidecarDeviceState)) {
                    return;
                }
                this.lastDeviceState = sidecarDeviceState;
                this.callbackInterface.onDeviceStateChanged(sidecarDeviceState);
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            iBinder.getClass();
            sidecarWindowLayoutInfo.getClass();
            synchronized (this.lock) {
                if (this.sidecarAdapter.isEqualSidecarWindowLayoutInfo((SidecarWindowLayoutInfo) this.mActivityWindowLayoutInfo.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.callbackInterface.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class FirstAttachAdapter implements View.OnAttachStateChangeListener {
        private final WeakReference activityWeakReference;
        private final SidecarCompat sidecarCompat;

        public FirstAttachAdapter(SidecarCompat sidecarCompat, Activity activity) {
            sidecarCompat.getClass();
            activity.getClass();
            this.sidecarCompat = sidecarCompat;
            this.activityWeakReference = new WeakReference(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getClass();
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.activityWeakReference.get();
            IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
            if (activity == null || activityWindowToken$window_release == null) {
                return;
            }
            this.sidecarCompat.register(activityWindowToken$window_release, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.getClass();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        final /* synthetic */ SidecarCompat this$0;

        public TranslatingCallback(SidecarCompat sidecarCompat) {
            sidecarCompat.getClass();
            this.this$0 = sidecarCompat;
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface sidecar;
            sidecarDeviceState.getClass();
            Collection<Activity> values = this.this$0.windowListenerRegisteredContexts.values();
            SidecarCompat sidecarCompat = this.this$0;
            for (Activity activity : values) {
                IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (activityWindowToken$window_release != null && (sidecar = sidecarCompat.getSidecar()) != null) {
                    sidecarWindowLayoutInfo = sidecar.getWindowLayoutInfo(activityWindowToken$window_release);
                }
                ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = sidecarCompat.extensionCallback;
                if (extensionCallbackInterface != null) {
                    extensionCallbackInterface.onWindowLayoutChanged(activity, sidecarCompat.sidecarAdapter.translate(sidecarWindowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            iBinder.getClass();
            sidecarWindowLayoutInfo.getClass();
            Activity activity = (Activity) this.this$0.windowListenerRegisteredContexts.get(iBinder);
            if (activity != null) {
                SidecarAdapter sidecarAdapter = this.this$0.sidecarAdapter;
                SidecarInterface sidecar = this.this$0.getSidecar();
                SidecarDeviceState deviceState = sidecar == null ? null : sidecar.getDeviceState();
                if (deviceState == null) {
                    deviceState = new SidecarDeviceState();
                }
                WindowLayoutInfo translate = sidecarAdapter.translate(sidecarWindowLayoutInfo, deviceState);
                ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.this$0.extensionCallback;
                if (extensionCallbackInterface == null) {
                    return;
                }
                extensionCallbackInterface.onWindowLayoutChanged(activity, translate);
                return;
            }
            Log.w(SidecarCompat.TAG, "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(SidecarProvider.getSidecarImpl(context), new SidecarAdapter());
        context.getClass();
    }

    private final void registerConfigurationChangeListener(final Activity activity) {
        if (this.componentCallbackMap.get(activity) == null) {
            ComponentCallbacks componentCallbacks = new ComponentCallbacks() { // from class: androidx.window.layout.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                    configuration.getClass();
                    ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = SidecarCompat.this.extensionCallback;
                    if (extensionCallbackInterface == null) {
                        return;
                    }
                    Activity activity2 = activity;
                    extensionCallbackInterface.onWindowLayoutChanged(activity2, SidecarCompat.this.getWindowLayoutInfo(activity2));
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }
            };
            this.componentCallbackMap.put(activity, componentCallbacks);
            activity.registerComponentCallbacks(componentCallbacks);
        }
    }

    private final void unregisterComponentCallback(Activity activity) {
        activity.unregisterComponentCallbacks((ComponentCallbacks) this.componentCallbackMap.get(activity));
        this.componentCallbackMap.remove(activity);
    }

    public final SidecarInterface getSidecar() {
        return this.sidecar;
    }

    public final WindowLayoutInfo getWindowLayoutInfo(Activity activity) {
        activity.getClass();
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return new WindowLayoutInfo(azsh.a);
        }
        SidecarInterface sidecarInterface = this.sidecar;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(activityWindowToken$window_release);
        SidecarAdapter sidecarAdapter = this.sidecarAdapter;
        SidecarInterface sidecarInterface2 = this.sidecar;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return sidecarAdapter.translate(windowLayoutInfo, deviceState);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerAdded(Activity activity) {
        activity.getClass();
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release != null) {
            register(activityWindowToken$window_release, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new FirstAttachAdapter(this, activity));
        }
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerRemoved(Activity activity) {
        SidecarInterface sidecarInterface;
        activity.getClass();
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(activityWindowToken$window_release);
        }
        unregisterComponentCallback(activity);
        int size = this.windowListenerRegisteredContexts.size();
        this.windowListenerRegisteredContexts.remove(activityWindowToken$window_release);
        if (size != 1 || (sidecarInterface = this.sidecar) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final void register(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        iBinder.getClass();
        activity.getClass();
        this.windowListenerRegisteredContexts.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.windowListenerRegisteredContexts.size() == 1 && (sidecarInterface = this.sidecar) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.extensionCallback;
        if (extensionCallbackInterface != null) {
            extensionCallbackInterface.onWindowLayoutChanged(activity, getWindowLayoutInfo(activity));
        }
        registerConfigurationChangeListener(activity);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void setExtensionCallback(ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface) {
        extensionCallbackInterface.getClass();
        this.extensionCallback = new DistinctElementCallback(extensionCallbackInterface);
        SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.sidecarAdapter, new TranslatingCallback(this)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x0196, TryCatch #2 {all -> 0x0196, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:12:0x0030, B:13:0x0033, B:15:0x0037, B:16:0x003a, B:21:0x005b, B:23:0x0063, B:28:0x0084, B:30:0x008c, B:35:0x00ac, B:37:0x00b4, B:40:0x00ba, B:41:0x00f0, B:43:0x010a, B:47:0x010e, B:49:0x013d, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bd, B:60:0x00e8, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a8, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x0069, B:79:0x0070, B:80:0x017e, B:81:0x0189, B:82:0x0057, B:83:0x0040, B:86:0x0047, B:87:0x018a, B:88:0x0195, B:89:0x0020, B:90:0x0009, B:93:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[Catch: all -> 0x0196, TryCatch #2 {all -> 0x0196, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:12:0x0030, B:13:0x0033, B:15:0x0037, B:16:0x003a, B:21:0x005b, B:23:0x0063, B:28:0x0084, B:30:0x008c, B:35:0x00ac, B:37:0x00b4, B:40:0x00ba, B:41:0x00f0, B:43:0x010a, B:47:0x010e, B:49:0x013d, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bd, B:60:0x00e8, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a8, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x0069, B:79:0x0070, B:80:0x017e, B:81:0x0189, B:82:0x0057, B:83:0x0040, B:86:0x0047, B:87:0x018a, B:88:0x0195, B:89:0x0020, B:90:0x0009, B:93:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c A[Catch: all -> 0x0196, TryCatch #2 {all -> 0x0196, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:12:0x0030, B:13:0x0033, B:15:0x0037, B:16:0x003a, B:21:0x005b, B:23:0x0063, B:28:0x0084, B:30:0x008c, B:35:0x00ac, B:37:0x00b4, B:40:0x00ba, B:41:0x00f0, B:43:0x010a, B:47:0x010e, B:49:0x013d, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bd, B:60:0x00e8, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a8, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x0069, B:79:0x0070, B:80:0x017e, B:81:0x0189, B:82:0x0057, B:83:0x0040, B:86:0x0047, B:87:0x018a, B:88:0x0195, B:89:0x0020, B:90:0x0009, B:93:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4 A[Catch: all -> 0x0196, TRY_LEAVE, TryCatch #2 {all -> 0x0196, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:12:0x0030, B:13:0x0033, B:15:0x0037, B:16:0x003a, B:21:0x005b, B:23:0x0063, B:28:0x0084, B:30:0x008c, B:35:0x00ac, B:37:0x00b4, B:40:0x00ba, B:41:0x00f0, B:43:0x010a, B:47:0x010e, B:49:0x013d, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bd, B:60:0x00e8, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a8, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x0069, B:79:0x0070, B:80:0x017e, B:81:0x0189, B:82:0x0057, B:83:0x0040, B:86:0x0047, B:87:0x018a, B:88:0x0195, B:89:0x0020, B:90:0x0009, B:93:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166 A[Catch: all -> 0x0196, TryCatch #2 {all -> 0x0196, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:12:0x0030, B:13:0x0033, B:15:0x0037, B:16:0x003a, B:21:0x005b, B:23:0x0063, B:28:0x0084, B:30:0x008c, B:35:0x00ac, B:37:0x00b4, B:40:0x00ba, B:41:0x00f0, B:43:0x010a, B:47:0x010e, B:49:0x013d, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bd, B:60:0x00e8, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a8, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x0069, B:79:0x0070, B:80:0x017e, B:81:0x0189, B:82:0x0057, B:83:0x0040, B:86:0x0047, B:87:0x018a, B:88:0x0195, B:89:0x0020, B:90:0x0009, B:93:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a8 A[Catch: all -> 0x0196, TryCatch #2 {all -> 0x0196, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:12:0x0030, B:13:0x0033, B:15:0x0037, B:16:0x003a, B:21:0x005b, B:23:0x0063, B:28:0x0084, B:30:0x008c, B:35:0x00ac, B:37:0x00b4, B:40:0x00ba, B:41:0x00f0, B:43:0x010a, B:47:0x010e, B:49:0x013d, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bd, B:60:0x00e8, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a8, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x0069, B:79:0x0070, B:80:0x017e, B:81:0x0189, B:82:0x0057, B:83:0x0040, B:86:0x0047, B:87:0x018a, B:88:0x0195, B:89:0x0020, B:90:0x0009, B:93:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172 A[Catch: all -> 0x0196, TryCatch #2 {all -> 0x0196, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:12:0x0030, B:13:0x0033, B:15:0x0037, B:16:0x003a, B:21:0x005b, B:23:0x0063, B:28:0x0084, B:30:0x008c, B:35:0x00ac, B:37:0x00b4, B:40:0x00ba, B:41:0x00f0, B:43:0x010a, B:47:0x010e, B:49:0x013d, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bd, B:60:0x00e8, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a8, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x0069, B:79:0x0070, B:80:0x017e, B:81:0x0189, B:82:0x0057, B:83:0x0040, B:86:0x0047, B:87:0x018a, B:88:0x0195, B:89:0x0020, B:90:0x0009, B:93:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0080 A[Catch: all -> 0x0196, TryCatch #2 {all -> 0x0196, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:12:0x0030, B:13:0x0033, B:15:0x0037, B:16:0x003a, B:21:0x005b, B:23:0x0063, B:28:0x0084, B:30:0x008c, B:35:0x00ac, B:37:0x00b4, B:40:0x00ba, B:41:0x00f0, B:43:0x010a, B:47:0x010e, B:49:0x013d, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bd, B:60:0x00e8, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a8, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x0069, B:79:0x0070, B:80:0x017e, B:81:0x0189, B:82:0x0057, B:83:0x0040, B:86:0x0047, B:87:0x018a, B:88:0x0195, B:89:0x0020, B:90:0x0009, B:93:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017e A[Catch: all -> 0x0196, TryCatch #2 {all -> 0x0196, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:12:0x0030, B:13:0x0033, B:15:0x0037, B:16:0x003a, B:21:0x005b, B:23:0x0063, B:28:0x0084, B:30:0x008c, B:35:0x00ac, B:37:0x00b4, B:40:0x00ba, B:41:0x00f0, B:43:0x010a, B:47:0x010e, B:49:0x013d, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bd, B:60:0x00e8, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a8, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x0069, B:79:0x0070, B:80:0x017e, B:81:0x0189, B:82:0x0057, B:83:0x0040, B:86:0x0047, B:87:0x018a, B:88:0x0195, B:89:0x0020, B:90:0x0009, B:93:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0057 A[Catch: all -> 0x0196, TryCatch #2 {all -> 0x0196, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:12:0x0030, B:13:0x0033, B:15:0x0037, B:16:0x003a, B:21:0x005b, B:23:0x0063, B:28:0x0084, B:30:0x008c, B:35:0x00ac, B:37:0x00b4, B:40:0x00ba, B:41:0x00f0, B:43:0x010a, B:47:0x010e, B:49:0x013d, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bd, B:60:0x00e8, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a8, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x0069, B:79:0x0070, B:80:0x017e, B:81:0x0189, B:82:0x0057, B:83:0x0040, B:86:0x0047, B:87:0x018a, B:88:0x0195, B:89:0x0020, B:90:0x0009, B:93:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018a A[Catch: all -> 0x0196, TryCatch #2 {all -> 0x0196, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:12:0x0030, B:13:0x0033, B:15:0x0037, B:16:0x003a, B:21:0x005b, B:23:0x0063, B:28:0x0084, B:30:0x008c, B:35:0x00ac, B:37:0x00b4, B:40:0x00ba, B:41:0x00f0, B:43:0x010a, B:47:0x010e, B:49:0x013d, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bd, B:60:0x00e8, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a8, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x0069, B:79:0x0070, B:80:0x017e, B:81:0x0189, B:82:0x0057, B:83:0x0040, B:86:0x0047, B:87:0x018a, B:88:0x0195, B:89:0x0020, B:90:0x0009, B:93:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0020 A[Catch: all -> 0x0196, TryCatch #2 {all -> 0x0196, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:12:0x0030, B:13:0x0033, B:15:0x0037, B:16:0x003a, B:21:0x005b, B:23:0x0063, B:28:0x0084, B:30:0x008c, B:35:0x00ac, B:37:0x00b4, B:40:0x00ba, B:41:0x00f0, B:43:0x010a, B:47:0x010e, B:49:0x013d, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bd, B:60:0x00e8, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a8, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x0069, B:79:0x0070, B:80:0x017e, B:81:0x0189, B:82:0x0057, B:83:0x0040, B:86:0x0047, B:87:0x018a, B:88:0x0195, B:89:0x0020, B:90:0x0009, B:93:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    @Override // androidx.window.layout.ExtensionInterfaceCompat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean validateExtensionInterface() {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.validateExtensionInterface():boolean");
    }

    public SidecarCompat(SidecarInterface sidecarInterface, SidecarAdapter sidecarAdapter) {
        sidecarAdapter.getClass();
        this.sidecar = sidecarInterface;
        this.sidecarAdapter = sidecarAdapter;
        this.windowListenerRegisteredContexts = new LinkedHashMap();
        this.componentCallbackMap = new LinkedHashMap();
    }
}
