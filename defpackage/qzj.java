package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.cardboard.sdk.R;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qzj extends qzp {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;
    final /* synthetic */ qzl c;
    final /* synthetic */ oba d;

    public qzj(Intent intent, WeakReference weakReference, qzl qzlVar, oba obaVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = intent;
        this.b = weakReference;
        this.c = qzlVar;
        this.d = obaVar;
    }

    @Override // defpackage.qzp
    public final void c(GoogleHelp googleHelp) {
        SafeParcelable safeParcelable;
        ViewGroup viewGroup;
        long nanoTime = System.nanoTime();
        this.a.putExtra("EXTRA_START_TICK", nanoTime);
        final Activity activity = (Activity) this.b.get();
        if (activity == null) {
            this.c.l(qzm.a);
            return;
        }
        if (this.d != null) {
            Context applicationContext = activity.getApplicationContext();
            oba obaVar = this.d;
            if (obaVar != null) {
                googleHelp.B = true;
                rbd.g(new qzb(applicationContext, googleHelp, nanoTime));
                rbd.g(new qzc(applicationContext, googleHelp, obaVar, nanoTime, null, null, null));
            }
        }
        googleHelp.z = qmy.b;
        TogglingData togglingData = googleHelp.w;
        if (togglingData != null) {
            String charSequence = activity.getTitle().toString();
            int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
            if (identifier != 0 && (viewGroup = (ViewGroup) activity.findViewById(identifier)) != null) {
                int i = 0;
                while (true) {
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof TextView) {
                        charSequence = ((TextView) childAt).getText().toString();
                        break;
                    }
                    i++;
                }
            }
            togglingData.c = charSequence;
        }
        qzl qzlVar = this.c;
        final Intent intent = this.a;
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            Parcelable.Creator creator = InProductHelp.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("EXTRA_IN_PRODUCT_HELP");
            if (byteArrayExtra == null) {
                safeParcelable = null;
            } else {
                qip.an(creator);
                int length = byteArrayExtra.length;
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(byteArrayExtra, 0, length);
                obtain.setDataPosition(0);
                safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
                obtain.recycle();
            }
            InProductHelp inProductHelp = (InProductHelp) safeParcelable;
            inProductHelp.a = googleHelp;
            Parcel obtain2 = Parcel.obtain();
            qui.b(inProductHelp, obtain2, 0);
            byte[] marshall = obtain2.marshall();
            obtain2.recycle();
            intent.putExtra("EXTRA_IN_PRODUCT_HELP", marshall);
        }
        new amcc(Looper.getMainLooper(), (byte[]) null).post(new Runnable() { // from class: qzd
            @Override // java.lang.Runnable
            public final void run() {
                activity.startActivityForResult(intent, R.styleable.AppCompatTheme_windowFixedWidthMinor);
            }
        });
        qzlVar.n(Status.a);
    }
}
