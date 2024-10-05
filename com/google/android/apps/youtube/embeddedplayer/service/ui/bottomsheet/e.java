package com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.youtube.R;
import defpackage.ahh;
import defpackage.algb;
import defpackage.jw;
import defpackage.ng;
import defpackage.opn;
import j$.util.Optional;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e extends ng {
    public algb a;
    public BottomSheetBehavior b;
    public boolean c;

    public e(Context context) {
        super(context, R.style.EmbedBottomSheetDialogThemeLight);
    }

    public final void a(float f) {
        Window window = getWindow();
        if (window != null) {
            window.setDimAmount(f);
        }
    }

    public final void b(e eVar) {
        this.c = true;
        eVar.c = true;
        eVar.show();
        cancel();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        BottomSheetBehavior bottomSheetBehavior = this.b;
        if (bottomSheetBehavior.t == 5) {
            super.cancel();
            return;
        }
        algb algbVar = this.a;
        if (algbVar != null) {
            bottomSheetBehavior.y(algbVar);
        }
        this.b.G(5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ng, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    protected final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.b;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.E(true);
            this.b.G(4);
            this.b.F(0);
            View findViewById = findViewById(R.id.embed_bottom_sheet);
            if (findViewById != null) {
                findViewById.addOnLayoutChangeListener(new c(this, findViewById));
            }
        }
    }

    @Override // defpackage.ng, android.app.Dialog
    public final void setContentView(View view) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.embed_bottom_sheet_dialog, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(R.id.embed_bottom_sheet);
        BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
        this.b = bottomSheetBehavior;
        algb algbVar = this.a;
        if (algbVar != null) {
            bottomSheetBehavior.y(algbVar);
        }
        ((ahh) frameLayout2.getLayoutParams()).b(this.b);
        frameLayout2.addView(view);
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e.this.cancel();
            }
        });
        jw.M(frameLayout2, new d(this));
        super.setContentView(frameLayout);
    }

    @Override // android.app.Dialog
    public final void show() {
        Window window = getWindow();
        if (window != null) {
            window.setFlags(8, 8);
            Optional g = opn.g(getContext());
            if (g.isPresent()) {
                window.getDecorView().setSystemUiVisibility(((Activity) g.get()).getWindow().getDecorView().getSystemUiVisibility());
                super.show();
                window.clearFlags(8);
                return;
            }
            super.show();
        }
    }
}
