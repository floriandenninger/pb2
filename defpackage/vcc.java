package defpackage;

import android.app.Fragment;
import android.app.assist.AssistContent;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import j$.util.function.Consumer;
import java.util.Collections;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class vcc extends ml {
    private int WH;
    protected final vbo k = new vbo();

    private final void om() {
        this.WH--;
    }

    private final void oo() {
        int i = this.WH;
        this.WH = i + 1;
        if (i == 0) {
            vbo vboVar = this.k;
            for (int i2 = 0; i2 < vboVar.a.size(); i2++) {
                vca vcaVar = (vca) vboVar.a.get(i2);
                if (vcaVar instanceof vbk) {
                    ((vbk) vcaVar).a();
                }
            }
        }
    }

    @Override // defpackage.ml, defpackage.er, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        vbo vboVar = this.k;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vaq) {
                if (((vaq) vcaVar).a(keyEvent)) {
                    return true;
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final void finish() {
        vbo vboVar = this.k;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof var) {
                ((var) vcaVar).a();
            }
        }
        super.finish();
    }

    @Override // android.app.Activity
    public final void finishAfterTransition() {
        vbo vboVar = this.k;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vas) {
                ((vas) vcaVar).a();
            }
        }
        super.finishAfterTransition();
    }

    @Override // android.app.Activity
    public final void onActivityReenter(int i, Intent intent) {
        vbo vboVar = this.k;
        for (int i2 = 0; i2 < vboVar.a.size(); i2++) {
            vca vcaVar = (vca) vboVar.a.get(i2);
            if (vcaVar instanceof vat) {
                ((vat) vcaVar).a();
            }
        }
        super.onActivityReenter(i, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        vbo vboVar = this.k;
        for (int i3 = 0; i3 < vboVar.a.size(); i3++) {
            vca vcaVar = (vca) vboVar.a.get(i3);
            if (vcaVar instanceof vbp) {
                ((vbp) vcaVar).a();
            }
        }
    }

    @Override // defpackage.ci
    public final void onAttachFragment(ce ceVar) {
        vbo vboVar = this.k;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vcd) {
                ((vcd) vcaVar).a();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        vbo vboVar = this.k;
        vbm vbmVar = new vbm(0);
        vboVar.b(vbmVar);
        vboVar.j = vbmVar;
        super.onAttachedToWindow();
    }

    @Override // defpackage.zv, android.app.Activity
    public void onBackPressed() {
        vbo vboVar = this.k;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vav) {
                if (((vav) vcaVar).a()) {
                    return;
                }
            }
        }
        super.onBackPressed();
    }

    @Override // defpackage.ml, defpackage.ci, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        vbo vboVar = this.k;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vbq) {
                ((vbq) vcaVar).a();
            }
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public final boolean onContextItemSelected(MenuItem menuItem) {
        vbo vboVar = this.k;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vbr) {
                if (((vbr) vcaVar).a()) {
                    return true;
                }
            }
        }
        return super.onContextItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public void onCreate(Bundle bundle) {
        vbo vboVar = this.k;
        vbl vblVar = new vbl(bundle, 2);
        vboVar.b(vblVar);
        vboVar.c = vblVar;
        super.onCreate(bundle);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        vbo vboVar = this.k;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vbs) {
                ((vbs) vcaVar).a();
            }
        }
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        vbo vboVar = this.k;
        boolean z = false;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vbt) {
                z |= ((vbt) vcaVar).a();
            }
        }
        return z || super.onCreateOptionsMenu(menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public void onDestroy() {
        vbo vboVar = this.k;
        vbn vbnVar = vboVar.h;
        if (vbnVar != null) {
            vboVar.a(vbnVar);
            vboVar.h = null;
        }
        vbn vbnVar2 = vboVar.g;
        if (vbnVar2 != null) {
            vboVar.a(vbnVar2);
            vboVar.g = null;
        }
        vbn vbnVar3 = vboVar.f;
        if (vbnVar3 != null) {
            vboVar.a(vbnVar3);
            vboVar.f = null;
        }
        vbn vbnVar4 = vboVar.c;
        if (vbnVar4 != null) {
            vboVar.a(vbnVar4);
            vboVar.c = null;
        }
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            vcaVar.getClass();
            if (vcaVar instanceof vyi) {
                ((vyi) vcaVar).b();
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        vbo vboVar = this.k;
        vbn vbnVar = vboVar.j;
        if (vbnVar != null) {
            vboVar.a(vbnVar);
            vboVar.j = null;
        }
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            vcaVar.getClass();
            if (vcaVar instanceof vaw) {
                ((vaw) vcaVar).a();
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.app.Activity
    public final /* synthetic */ void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        j$.util.function.Consumer convert = Consumer.VivifiedWrapper.convert(consumer);
        vbo vboVar = this.k;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vax) {
                ((vax) vcaVar).a();
                return;
            }
        }
        convert.accept(Collections.emptyList());
    }

    @Override // defpackage.ml, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        vbo vboVar = this.k;
        for (int i2 = 0; i2 < vboVar.a.size(); i2++) {
            vca vcaVar = (vca) vboVar.a.get(i2);
            if (vcaVar instanceof vay) {
                if (((vay) vcaVar).a()) {
                    return true;
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        vbo vboVar = this.k;
        for (int i2 = 0; i2 < vboVar.a.size(); i2++) {
            vca vcaVar = (vca) vboVar.a.get(i2);
            if (vcaVar instanceof vaz) {
                if (((vaz) vcaVar).a()) {
                    return true;
                }
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.ci, android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        for (vca vcaVar : this.k.a) {
            if (vcaVar instanceof vbu) {
                ((vbu) vcaVar).a();
            }
        }
        super.onLowMemory();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        vbo vboVar = this.k;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vba) {
                ((vba) vcaVar).a();
            }
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        vbo vboVar = this.k;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vbv) {
                if (((vbv) vcaVar).a()) {
                    return true;
                }
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, android.app.Activity
    public void onPause() {
        vbo vboVar = this.k;
        vbn vbnVar = vboVar.i;
        if (vbnVar != null) {
            vboVar.a(vbnVar);
            vboVar.i = null;
        }
        vbn vbnVar2 = vboVar.e;
        if (vbnVar2 != null) {
            vboVar.a(vbnVar2);
            vboVar.e = null;
        }
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            vcaVar.getClass();
            if (vcaVar instanceof vyi) {
                ((vyi) vcaVar).c();
            }
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final /* synthetic */ void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, java.util.function.Consumer consumer) {
        Consumer.VivifiedWrapper.convert(consumer);
        vbo vboVar = this.k;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vbb) {
                ((vbb) vcaVar).a();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        vbo vboVar = this.k;
        vbl vblVar = new vbl(bundle, 1);
        vboVar.b(vblVar);
        vboVar.g = vblVar;
        super.onPostCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public void onPostResume() {
        vbo vboVar = this.k;
        vbm vbmVar = new vbm(1);
        vboVar.b(vbmVar);
        vboVar.i = vbmVar;
        super.onPostResume();
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        vbo vboVar = this.k;
        boolean z = false;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vbw) {
                z |= ((vbw) vcaVar).a();
            }
        }
        return z || super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        vbo vboVar = this.k;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vbe) {
                ((vbe) vcaVar).a();
            }
        }
        super.onProvideAssistContent(assistContent);
    }

    @Override // android.app.Activity
    public final void onProvideAssistData(Bundle bundle) {
        vbo vboVar = this.k;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vbf) {
                ((vbf) vcaVar).a();
            }
        }
        super.onProvideAssistData(bundle);
    }

    @Override // defpackage.ci, defpackage.zv, android.app.Activity, defpackage.ahn
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        vbo vboVar = this.k;
        for (int i2 = 0; i2 < vboVar.a.size(); i2++) {
            vca vcaVar = (vca) vboVar.a.get(i2);
            if (vcaVar instanceof vbx) {
                ((vbx) vcaVar).a();
            }
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        vbo vboVar = this.k;
        vbl vblVar = new vbl(bundle, 0);
        vboVar.b(vblVar);
        vboVar.h = vblVar;
        super.onRestoreInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, android.app.Activity
    public void onResume() {
        uqq.r(getSupportFragmentManager());
        vbo vboVar = this.k;
        vbm vbmVar = new vbm(3);
        vboVar.b(vbmVar);
        vboVar.e = vbmVar;
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zv, defpackage.er, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        vbo vboVar = this.k;
        vbl vblVar = new vbl(bundle, 3);
        vboVar.b(vblVar);
        vboVar.f = vblVar;
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public void onStart() {
        uqq.r(getSupportFragmentManager());
        vbo vboVar = this.k;
        vbm vbmVar = new vbm(2);
        vboVar.b(vbmVar);
        vboVar.d = vbmVar;
        super.onStart();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public void onStop() {
        vbo vboVar = this.k;
        vbn vbnVar = vboVar.d;
        if (vbnVar != null) {
            vboVar.a(vbnVar);
            vboVar.d = null;
        }
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            vcaVar.getClass();
            if (vcaVar instanceof vbz) {
                ((vbz) vcaVar).a();
            }
        }
        super.onStop();
    }

    @Override // defpackage.ml, defpackage.mm
    public final void onSupportActionModeFinished(pp ppVar) {
        vbo vboVar = this.k;
        if (ppVar != null) {
            for (int i = 0; i < vboVar.a.size(); i++) {
                vca vcaVar = (vca) vboVar.a.get(i);
                if (vcaVar instanceof vce) {
                    ((vce) vcaVar).a();
                }
            }
        }
    }

    @Override // defpackage.ml, defpackage.mm
    public final void onSupportActionModeStarted(pp ppVar) {
        vbo vboVar = this.k;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vcf) {
                ((vcf) vcaVar).a();
            }
        }
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        vbo vboVar = this.k;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vbh) {
                ((vbh) vcaVar).a();
            }
        }
        super.onUserInteraction();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        vbo vboVar = this.k;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vbi) {
                ((vbi) vcaVar).a();
            }
        }
        super.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        vbo vboVar = this.k;
        for (int i = 0; i < vboVar.a.size(); i++) {
            vca vcaVar = (vca) vboVar.a.get(i);
            if (vcaVar instanceof vbj) {
                ((vbj) vcaVar).a();
            }
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        oo();
        super.startActivity(intent);
        om();
    }

    @Override // defpackage.zv, android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        oo();
        super.startActivityForResult(intent, i);
        om();
    }

    @Override // android.app.Activity
    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        oo();
        super.startActivityFromFragment(fragment, intent, i, bundle);
        om();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        oo();
        super.startActivity(intent, bundle);
        om();
    }

    @Override // defpackage.zv, android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        oo();
        super.startActivityForResult(intent, i, bundle);
        om();
    }

    @Override // defpackage.ci
    public final void startActivityFromFragment(ce ceVar, Intent intent, int i) {
        oo();
        super.startActivityFromFragment(ceVar, intent, i);
        om();
    }
}
