package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class er extends Activity implements aok, io {
    private aeg mExtraDataMap = new aeg();
    private aom mLifecycleRegistry = new aom(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !jw.ae(decorView, keyEvent)) {
            return ip.a(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !jw.ae(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public eq getExtraData(Class cls) {
        return (eq) this.mExtraDataMap.get(cls);
    }

    public aof getLifecycle() {
        return this.mLifecycleRegistry;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ape.b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        aom aomVar = this.mLifecycleRegistry;
        aoe aoeVar = aoe.CREATED;
        aom.g("markState");
        aomVar.f(aoeVar);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(eq eqVar) {
        this.mExtraDataMap.put(eqVar.getClass(), eqVar);
    }

    @Override // defpackage.io
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
