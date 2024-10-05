package com.google.vr.ndk.base;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParamsList;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import defpackage.awxr;
import defpackage.axhe;
import defpackage.axhf;
import defpackage.axhh;
import defpackage.axhl;
import defpackage.axhm;
import defpackage.axhn;
import defpackage.axho;
import defpackage.axhp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DaydreamApi implements AutoCloseable {
    private static volatile Boolean bootsToVr;
    private boolean closed;
    private final Context context;
    private axhl daydreamManager;
    private int vrCoreApiVersion;
    private axhp vrCoreSdkService;
    private ArrayList queuedRunnables = new ArrayList();
    private final AtomicInteger lastUsedRequestCode = new AtomicInteger();
    private final ServiceConnection connection = new ServiceConnection() { // from class: com.google.vr.ndk.base.DaydreamApi.1
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            DaydreamApi.this.vrCoreSdkService = null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            axhp axhoVar;
            DaydreamApi daydreamApi = DaydreamApi.this;
            if (iBinder == null) {
                axhoVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IVrCoreSdkService");
                if (queryLocalInterface instanceof axhp) {
                    axhoVar = (axhp) queryLocalInterface;
                } else {
                    axhoVar = new axho(iBinder);
                }
            }
            daydreamApi.vrCoreSdkService = axhoVar;
            try {
                DaydreamApi daydreamApi2 = DaydreamApi.this;
                daydreamApi2.daydreamManager = daydreamApi2.vrCoreSdkService.a();
            } catch (RemoteException unused) {
                Log.e("DaydreamApi", "RemoteException in onServiceConnected");
            }
            if (DaydreamApi.this.daydreamManager == null) {
                Log.w("DaydreamApi", "Daydream service component unavailable.");
            }
            ArrayList arrayList = DaydreamApi.this.queuedRunnables;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) arrayList.get(i)).run();
            }
            DaydreamApi.this.queuedRunnables.clear();
        }
    };

    protected DaydreamApi(Context context) {
        this.context = context;
    }

    public static boolean bootsToVr(Context context) {
        if (bootsToVr == null) {
            bootsToVr = Boolean.valueOf(getBooleanSetting(context, "boots_to_vr", false));
        }
        return bootsToVr.booleanValue();
    }

    private void checkIntent(Intent intent) {
        List<ResolveInfo> queryIntentActivities = this.context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
            sb.append("No activity is available to handle intent: ");
            sb.append(valueOf);
            throw new ActivityNotFoundException(sb.toString());
        }
    }

    private void checkNotClosed() {
        if (this.closed) {
            throw new IllegalStateException("DaydreamApi object is closed and can no longer be used.");
        }
    }

    public static DaydreamApi create(Context context) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("DaydreamApi must only be used from the main thread.");
        }
        if (!DaydreamUtils.isDaydreamPhone(context)) {
            return null;
        }
        DaydreamApi daydreamApi = new DaydreamApi(context);
        if (daydreamApi.init()) {
            return daydreamApi;
        }
        Log.w("DaydreamApi", "Failed to initialize DaydreamApi object.");
        return null;
    }

    public static Intent createVrIntent(ComponentName componentName) {
        Intent intent = new Intent();
        intent.setComponent(componentName);
        setupVrIntent(intent);
        return intent;
    }

    static boolean getBooleanSetting(Context context, String str, boolean z) {
        axhf i = awxr.i(context);
        if (i == null) {
            Log.e("DaydreamApi", "No ContentProvider available for boots_to_vr");
            return false;
        }
        Cursor cursor = null;
        try {
            try {
                try {
                    cursor = i.a.query(awxr.g(i.b, "boots_to_vr"), null, null, null, null);
                    if (cursor == null || !cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        i.a();
                        return false;
                    }
                    boolean z2 = cursor.getInt(0) == 1;
                    cursor.close();
                    i.a();
                    return z2;
                } catch (SecurityException e) {
                    StringBuilder sb = new StringBuilder(71);
                    sb.append("Insufficient permissions to read ");
                    sb.append("boots_to_vr");
                    sb.append(" state from ContentProvider");
                    Log.e("DaydreamApi", sb.toString(), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    i.a();
                    return false;
                }
            } catch (RemoteException e2) {
                StringBuilder sb2 = new StringBuilder(53);
                sb2.append("Failed to read ");
                sb2.append("boots_to_vr");
                sb2.append(" state from ContentProvider");
                Log.e("DaydreamApi", sb2.toString(), e2);
                if (cursor != null) {
                    cursor.close();
                }
                i.a();
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            i.a();
            throw th;
        }
    }

    public static CardboardDevice$DeviceParamsList getRecentHeadsets(Context context) {
        axhe h = awxr.h(context);
        try {
            return h.c();
        } catch (Exception e) {
            Log.e("DaydreamApi", "Error when getting recent headsets", e);
            return CardboardDevice$DeviceParamsList.getDefaultInstance();
        } finally {
            h.f();
        }
    }

    public static boolean isDaydreamReadyPlatform(Context context) {
        return DaydreamUtils.isDaydreamPhone(context);
    }

    private void launchTransitionCallbackInVr(final axhn axhnVar) {
        runWhenServiceConnected(new Runnable() { // from class: com.google.vr.ndk.base.DaydreamApi.4
            @Override // java.lang.Runnable
            public void run() {
                if (DaydreamApi.this.daydreamManager != null) {
                    try {
                        if (DaydreamApi.this.daydreamManager.n(axhnVar)) {
                            return;
                        }
                    } catch (RemoteException e) {
                        Log.e("DaydreamApi", "RemoteException while launching VR transition: ", e);
                    }
                }
                Log.w("DaydreamApi", "Can't launch callbacks via DaydreamManager, sending manually");
                try {
                    axhnVar.onTransitionComplete();
                } catch (RemoteException unused) {
                }
            }
        });
    }

    public static Intent setupVrIntent(Intent intent) {
        intent.addCategory("com.google.intent.category.DAYDREAM");
        intent.addFlags(335609856);
        return intent;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        runWhenServiceConnected(new Runnable() { // from class: com.google.vr.ndk.base.DaydreamApi.12
            @Override // java.lang.Runnable
            public void run() {
                (DaydreamApi.this.context.getApplicationContext() != null ? DaydreamApi.this.context.getApplicationContext() : DaydreamApi.this.context).unbindService(DaydreamApi.this.connection);
                DaydreamApi.this.vrCoreSdkService = null;
            }
        });
    }

    public void exitFromVr(Activity activity, int i, Intent intent) {
        exitFromVr(activity, i, intent, null);
    }

    public int getUniqueRequestCode() {
        return this.lastUsedRequestCode.incrementAndGet();
    }

    protected boolean init() {
        int vrCoreClientApiVersion;
        try {
            vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(this.context);
            this.vrCoreApiVersion = vrCoreClientApiVersion;
        } catch (axhh e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("VrCore not available: ");
            sb.append(valueOf);
            Log.e("DaydreamApi", sb.toString());
        }
        if (vrCoreClientApiVersion < 8) {
            StringBuilder sb2 = new StringBuilder(69);
            sb2.append("VrCore out of date, current version: ");
            sb2.append(vrCoreClientApiVersion);
            sb2.append(", required version: ");
            sb2.append(8);
            Log.e("DaydreamApi", sb2.toString());
            return false;
        }
        Intent intent = new Intent("com.google.vr.vrcore.BIND_SDK_SERVICE");
        intent.setPackage("com.google.vr.vrcore");
        if ((this.context.getApplicationContext() != null ? this.context.getApplicationContext() : this.context).bindService(intent, this.connection, 1)) {
            return true;
        }
        Log.e("DaydreamApi", "Unable to bind to VrCoreSdkService");
        return false;
    }

    public void launchInVr(PendingIntent pendingIntent) {
        checkNotClosed();
        launchInVr(pendingIntent, null);
    }

    public void launchInVrForResult(final Activity activity, final PendingIntent pendingIntent, final int i) {
        checkNotClosed();
        launchTransitionCallbackInVr(new axhm(this) { // from class: com.google.vr.ndk.base.DaydreamApi.6
            @Override // defpackage.axhn
            public void onTransitionComplete() {
                activity.runOnUiThread(new Runnable() { // from class: com.google.vr.ndk.base.DaydreamApi.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
                        } catch (IntentSender.SendIntentException e) {
                            String valueOf = String.valueOf(e);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                            sb.append("Exception while starting next VR activity: ");
                            sb.append(valueOf);
                            Log.e("DaydreamApi", sb.toString());
                        }
                    }
                });
            }
        });
    }

    public void launchVrHomescreen() {
        checkNotClosed();
        runWhenServiceConnected(new Runnable() { // from class: com.google.vr.ndk.base.DaydreamApi.5
            @Override // java.lang.Runnable
            public void run() {
                if (DaydreamApi.this.daydreamManager == null) {
                    Log.e("DaydreamApi", "Can't launch VR homescreen via DaydreamManager. Giving up trying to leave current VR activity...");
                    return;
                }
                try {
                    if (DaydreamApi.this.daydreamManager.m()) {
                        return;
                    }
                    Log.e("DaydreamApi", "There is no VR homescreen installed.");
                } catch (RemoteException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("RemoteException while launching VR homescreen: ");
                    sb.append(valueOf);
                    Log.e("DaydreamApi", sb.toString());
                }
            }
        });
    }

    public void registerDaydreamIntent(final PendingIntent pendingIntent) {
        checkNotClosed();
        runWhenServiceConnected(new Runnable() { // from class: com.google.vr.ndk.base.DaydreamApi.2
            @Override // java.lang.Runnable
            public void run() {
                if (DaydreamApi.this.daydreamManager == null) {
                    Log.w("DaydreamApi", "Can't register/unregister daydream intent: no DaydreamManager.");
                    return;
                }
                try {
                    if (pendingIntent != null) {
                        DaydreamApi.this.daydreamManager.i(pendingIntent);
                    } else {
                        DaydreamApi.this.daydreamManager.j();
                    }
                } catch (RemoteException e) {
                    Log.e("DaydreamApi", "Error when attempting to register/unregister daydream intent: ", e);
                }
            }
        });
    }

    protected void runWhenServiceConnected(Runnable runnable) {
        if (this.vrCoreSdkService != null) {
            runnable.run();
        } else {
            this.queuedRunnables.add(runnable);
        }
    }

    public void unregisterDaydreamIntent() {
        checkNotClosed();
        registerDaydreamIntent(null);
    }

    public void exitFromVr(Activity activity, int i, Intent intent, String str) {
        checkNotClosed();
        if (intent == null) {
            intent = new Intent();
        }
        final PendingIntent createPendingResult = activity.createPendingResult(i, intent, 1073741824);
        runWhenServiceConnected(new Runnable(new Runnable(this) { // from class: com.google.vr.ndk.base.DaydreamApi.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    createPendingResult.send(0);
                } catch (Exception e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                    sb.append("Couldn't launch PendingIntent: ");
                    sb.append(valueOf);
                    Log.e("DaydreamApi", sb.toString());
                }
            }
        }, createPendingResult, null) { // from class: com.google.vr.ndk.base.DaydreamApi.8
            final /* synthetic */ String val$exitPromptText = null;
            final /* synthetic */ Runnable val$onFailureRunnable;
            final /* synthetic */ PendingIntent val$pendingVrExitIntent;

            @Override // java.lang.Runnable
            public void run() {
                if (DaydreamApi.this.daydreamManager == null) {
                    Log.w("DaydreamApi", "Failed to exit VR: Daydream service unavailable.");
                    this.val$onFailureRunnable.run();
                    return;
                }
                try {
                    if (DaydreamApi.this.vrCoreApiVersion >= 23) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("EXIT_VR_INTENT_KEY", this.val$pendingVrExitIntent);
                        bundle.putString("EXIT_VR_TEXT_KEY", this.val$exitPromptText);
                        if (DaydreamApi.this.daydreamManager.l(bundle)) {
                            return;
                        }
                        Log.w("DaydreamApi", "Failed to exit VR: Invalid request.");
                        this.val$onFailureRunnable.run();
                        return;
                    }
                    if (DaydreamApi.this.daydreamManager.k(this.val$pendingVrExitIntent)) {
                        return;
                    }
                    Log.w("DaydreamApi", "Failed to exit VR: Invalid request.");
                    this.val$onFailureRunnable.run();
                } catch (RemoteException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                    sb.append("Failed to exit VR: RemoteException while exiting:");
                    sb.append(valueOf);
                    Log.e("DaydreamApi", sb.toString());
                    this.val$onFailureRunnable.run();
                }
            }
        });
    }

    private void launchInVr(final PendingIntent pendingIntent, final ComponentName componentName) {
        runWhenServiceConnected(new Runnable() { // from class: com.google.vr.ndk.base.DaydreamApi.3
            @Override // java.lang.Runnable
            public void run() {
                if (DaydreamApi.this.daydreamManager != null) {
                    try {
                        DaydreamApi.this.daydreamManager.o(pendingIntent, componentName);
                        return;
                    } catch (RemoteException e) {
                        Log.e("DaydreamApi", "RemoteException while launching PendingIntent in VR.", e);
                        return;
                    }
                }
                Log.w("DaydreamApi", "Can't launch PendingIntent via DaydreamManager: not available.");
                try {
                    pendingIntent.send();
                } catch (Exception e2) {
                    Log.e("DaydreamApi", "Couldn't launch PendingIntent: ", e2);
                }
            }
        });
    }

    public void launchInVr(ComponentName componentName) {
        checkNotClosed();
        if (componentName == null) {
            throw new IllegalArgumentException("Null argument 'componentName' passed to launchInVr");
        }
        Intent createVrIntent = createVrIntent(componentName);
        checkIntent(createVrIntent);
        launchInVr(PendingIntent.getActivity(this.context, 0, createVrIntent, 1073741824), createVrIntent.getComponent());
    }

    public void launchInVr(Intent intent) {
        checkNotClosed();
        if (intent == null) {
            throw new IllegalArgumentException("Null argument 'intent' passed to launchInVr");
        }
        checkIntent(intent);
        launchInVr(PendingIntent.getActivity(this.context, getUniqueRequestCode(), intent, 1207959552), intent.getComponent());
    }
}
