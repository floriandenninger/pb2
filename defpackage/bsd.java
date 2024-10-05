package defpackage;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.preference.DialogPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bsd extends bv implements DialogInterface.OnClickListener {
    private DialogPreference ae;
    private CharSequence af;
    private CharSequence ag;
    private CharSequence ah;
    public int ai;
    private CharSequence aj;
    private int ak;
    private BitmapDrawable al;

    /* JADX INFO: Access modifiers changed from: protected */
    public void aF(View view) {
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.aj;
            int i = 0;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else if (findViewById instanceof TextView) {
                ((TextView) findViewById).setText(charSequence);
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    public abstract void aG(boolean z);

    protected void aH() {
    }

    protected boolean aJ() {
        return false;
    }

    public final DialogPreference aK() {
        if (this.ae == null) {
            this.ae = (DialogPreference) ((brm) B()).ol(this.m.getString("key"));
        }
        return this.ae;
    }

    protected View aL() {
        int i = this.ak;
        if (i == 0) {
            return null;
        }
        return mP().inflate(i, (ViewGroup) null);
    }

    protected void jU(mh mhVar) {
    }

    @Override // defpackage.bv, defpackage.ce
    public void mQ(Bundle bundle) {
        super.mQ(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.af);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.ag);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.ah);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.aj);
        bundle.putInt("PreferenceDialogFragment.layout", this.ak);
        BitmapDrawable bitmapDrawable = this.al;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // defpackage.bv, defpackage.ce
    public void mR(Bundle bundle) {
        super.mR(bundle);
        bue B = B();
        if (!(B instanceof brm)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        brm brmVar = (brm) B;
        String string = this.m.getString("key");
        if (bundle == null) {
            DialogPreference dialogPreference = (DialogPreference) brmVar.ol(string);
            this.ae = dialogPreference;
            this.af = dialogPreference.a;
            this.ag = dialogPreference.d;
            this.ah = dialogPreference.e;
            this.aj = dialogPreference.b;
            this.ak = dialogPreference.f;
            Drawable drawable = dialogPreference.c;
            if (drawable == null || (drawable instanceof BitmapDrawable)) {
                this.al = (BitmapDrawable) drawable;
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            this.al = new BitmapDrawable(qX(), createBitmap);
            return;
        }
        this.af = bundle.getCharSequence("PreferenceDialogFragment.title");
        this.ag = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
        this.ah = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
        this.aj = bundle.getCharSequence("PreferenceDialogFragment.message");
        this.ak = bundle.getInt("PreferenceDialogFragment.layout", 0);
        Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
        if (bitmap != null) {
            this.al = new BitmapDrawable(qX(), bitmap);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.ai = i;
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        aG(this.ai == -1);
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        this.ai = -2;
        mh mhVar = new mh(qR());
        mhVar.o(this.af);
        mhVar.e(this.al);
        mhVar.l(this.ag, this);
        mhVar.i(this.ah, this);
        qR();
        View aL = aL();
        if (aL != null) {
            aF(aL);
            mhVar.p(aL);
        } else {
            mhVar.g(this.aj);
        }
        jU(mhVar);
        mi b = mhVar.b();
        if (aJ()) {
            Window window = b.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                bsc.a(window);
            } else {
                aH();
            }
        }
        return b;
    }
}
