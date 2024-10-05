package defpackage;

import android.view.KeyEvent;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahvr implements ahvc {
    private final List a;

    public ahvr(ahvc... ahvcVarArr) {
        List asList = Arrays.asList(ahvcVarArr);
        asList.getClass();
        this.a = asList;
    }

    @Override // defpackage.ahvc
    public final void h(ahvb ahvbVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahvc) it.next()).h(ahvbVar);
        }
    }

    @Override // defpackage.ahvc
    public final void i(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahvc) it.next()).i(z);
        }
    }

    @Override // defpackage.ahvc
    public final void k(ControlsOverlayStyle controlsOverlayStyle) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahvc) it.next()).k(controlsOverlayStyle);
        }
    }

    @Override // defpackage.ahvc
    public final void nI(ControlsState controlsState) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahvc) it.next()).nI(controlsState);
        }
    }

    @Override // defpackage.ahvc
    public final void nJ(CharSequence charSequence) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahvc) it.next()).nJ(charSequence);
        }
    }

    @Override // defpackage.ahvc
    public final void nK(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahvc) it.next()).nK(z);
        }
    }

    @Override // defpackage.ahvc
    public final void nf() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahvc) it.next()).nf();
        }
    }

    @Override // defpackage.ahvc
    public final void ng() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahvc) it.next()).ng();
        }
    }

    @Override // defpackage.ahvc
    public final void nh(String str, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahvc) it.next()).nh(str, z);
        }
    }

    @Override // defpackage.ahvc
    public final void ns() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahvc) it.next()).ns();
        }
    }

    @Override // defpackage.ahvc
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ahvc
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ahvc
    public final void pA() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahvc) it.next()).pA();
        }
    }

    @Override // defpackage.ahvc
    public final void pB() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahvc) it.next()).pB();
        }
    }

    @Override // defpackage.ahvc
    public final void px(Map map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahvc) it.next()).px(map);
        }
    }

    @Override // defpackage.ahvc
    public final void py(long j, long j2, long j3, long j4) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahvc) it.next()).py(j, j2, j3, j4);
        }
    }

    @Override // defpackage.ahvc
    public final void r(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahvc) it.next()).r(z);
        }
    }

    @Override // defpackage.ahvc
    public final void s(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahvc) it.next()).s(z);
        }
    }

    @Override // defpackage.ahvc
    public final /* synthetic */ void y() {
        ahbx.c(this);
    }

    @Override // defpackage.ahvc
    public final void z(atyq atyqVar, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahvc) it.next()).z(atyqVar, z);
        }
    }
}
