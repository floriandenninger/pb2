package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ImmLeaksCleaner;
import defpackage.aod;
import defpackage.aok;
import defpackage.zv;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class zv extends er implements aok, apu, aoc, bue, zz, aak, aad {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final aaj mActivityResultRegistry;
    private int mContentLayoutId;
    public final aaa mContextAwareHelper;
    private apo mDefaultFactory;
    private final aom mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final zy mOnBackPressedDispatcher;
    final bud mSavedStateRegistryController;
    private apt mViewModelStore;

    public zv() {
        this.mContextAwareHelper = new aaa();
        this.mLifecycleRegistry = new aom(this);
        this.mSavedStateRegistryController = bud.a(this);
        this.mOnBackPressedDispatcher = new zy(new zr(this));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new aaj(this);
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().b(new aoi() { // from class: androidx.activity.ComponentActivity$3
            @Override // defpackage.aoi
            public final void a(aok aokVar, aod aodVar) {
                if (aodVar == aod.ON_STOP) {
                    Window window = zv.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        getLifecycle().b(new aoi() { // from class: androidx.activity.ComponentActivity$4
            @Override // defpackage.aoi
            public final void a(aok aokVar, aod aodVar) {
                if (aodVar == aod.ON_DESTROY) {
                    zv.this.mContextAwareHelper.b = null;
                    if (zv.this.isChangingConfigurations()) {
                        return;
                    }
                    zv.this.getViewModelStore().c();
                }
            }
        });
        getLifecycle().b(new aoi() { // from class: androidx.activity.ComponentActivity$5
            @Override // defpackage.aoi
            public final void a(aok aokVar, aod aodVar) {
                zv.this.ensureViewModelStore();
                zv.this.getLifecycle().c(this);
            }
        });
        if (Build.VERSION.SDK_INT <= 23) {
            getLifecycle().b(new ImmLeaksCleaner(this));
        }
        getSavedStateRegistry().b(ACTIVITY_RESULT_TAG, new bub() { // from class: zq
            @Override // defpackage.bub
            public final Bundle a() {
                return zv.this.m213lambda$new$0$androidxactivityComponentActivity();
            }
        });
        addOnContextAvailableListener(new aab() { // from class: zp
            @Override // defpackage.aab
            public final void a(Context context) {
                zv.this.m214lambda$new$1$androidxactivityComponentActivity(context);
            }
        });
    }

    private void initViewTreeOwners() {
        ho.F(getWindow().getDecorView(), this);
        arr.b(getWindow().getDecorView(), this);
        js.i(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public final void addOnContextAvailableListener(aab aabVar) {
        aaa aaaVar = this.mContextAwareHelper;
        if (aaaVar.b != null) {
            aabVar.a(aaaVar.b);
        }
        aaaVar.a.add(aabVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            zu zuVar = (zu) getLastNonConfigurationInstance();
            if (zuVar != null) {
                this.mViewModelStore = zuVar.b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new apt();
            }
        }
    }

    @Override // defpackage.aak
    public final aaj getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public apo getDefaultViewModelProviderFactory() {
        if (getApplication() != null) {
            if (this.mDefaultFactory == null) {
                this.mDefaultFactory = new apj(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        zu zuVar = (zu) getLastNonConfigurationInstance();
        if (zuVar != null) {
            return zuVar.a;
        }
        return null;
    }

    @Override // defpackage.er, defpackage.aok
    public aof getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final zy getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // defpackage.bue
    public final buc getSavedStateRegistry() {
        return this.mSavedStateRegistryController.a;
    }

    @Override // defpackage.apu
    public apt getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    /* renamed from: lambda$new$0$androidx-activity-ComponentActivity, reason: not valid java name */
    public /* synthetic */ Bundle m213lambda$new$0$androidxactivityComponentActivity() {
        Bundle bundle = new Bundle();
        aaj aajVar = this.mActivityResultRegistry;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(aajVar.c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(aajVar.c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(aajVar.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) aajVar.g.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", aajVar.a);
        return bundle;
    }

    /* renamed from: lambda$new$1$androidx-activity-ComponentActivity, reason: not valid java name */
    public /* synthetic */ void m214lambda$new$1$androidxactivityComponentActivity(Context context) {
        Bundle a = getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a != null) {
            aaj aajVar = this.mActivityResultRegistry;
            ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            aajVar.d = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            aajVar.a = (Random) a.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            aajVar.g.putAll(a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i = 0; i < stringArrayList.size(); i++) {
                String str = stringArrayList.get(i);
                if (aajVar.c.containsKey(str)) {
                    Integer num = (Integer) aajVar.c.remove(str);
                    if (!aajVar.g.containsKey(str)) {
                        aajVar.b.remove(num);
                    }
                }
                aajVar.c(integerArrayList.get(i).intValue(), stringArrayList.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.mActivityResultRegistry.e(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.er, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        aaa aaaVar = this.mContextAwareHelper;
        aaaVar.b = this;
        Iterator it = aaaVar.a.iterator();
        while (it.hasNext()) {
            ((aab) it.next()).a(this);
        }
        super.onCreate(bundle);
        ape.b(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity, defpackage.ahn
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.e(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        zu zuVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        apt aptVar = this.mViewModelStore;
        if (aptVar == null && (zuVar = (zu) getLastNonConfigurationInstance()) != null) {
            aptVar = zuVar.b;
        }
        if (aptVar == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        zu zuVar2 = new zu();
        zuVar2.a = onRetainCustomNonConfigurationInstance;
        zuVar2.b = aptVar;
        return zuVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.er, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        aof lifecycle = getLifecycle();
        if (lifecycle instanceof aom) {
            ((aom) lifecycle).f(aoe.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.b;
    }

    @Override // defpackage.aad
    public final aae registerForActivityResult(aam aamVar, aac aacVar) {
        return registerForActivityResult(aamVar, this.mActivityResultRegistry, aacVar);
    }

    public final void removeOnContextAvailableListener(aab aabVar) {
        this.mContextAwareHelper.a.remove(aabVar);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final aae registerForActivityResult(aam aamVar, aaj aajVar, aac aacVar) {
        return aajVar.b("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aamVar, aacVar);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        if (Build.VERSION.SDK_INT >= 29) {
            bvk.a();
        } else {
            try {
                if (jt.b == null) {
                    jt.a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    jt.b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                ((Boolean) jt.b.invoke(null, Long.valueOf(jt.a))).booleanValue();
            } catch (Exception e) {
                if (e instanceof InvocationTargetException) {
                    Throwable cause = e.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    throw new RuntimeException(cause);
                }
            }
        }
        super.reportFullyDrawn();
    }

    public zv(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
