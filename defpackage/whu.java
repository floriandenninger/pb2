package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
import java.util.Iterator;
import org.chromium.net.CellularSignalStrengthError;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class whu {
    public whu() {
    }

    public whu(byte[] bArr, byte[] bArr2) {
    }

    public whu(char[] cArr) {
    }

    public static aypy A(final View view, ayqi ayqiVar) {
        return aypy.v(new ayqa() { // from class: zbt
            @Override // defpackage.ayqa
            public final void a(final aypz aypzVar) {
                final View view2 = view;
                final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: zbs
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        aypz aypzVar2 = aypz.this;
                        if (aypzVar2.e()) {
                            return;
                        }
                        aypzVar2.d(new Rect(i, i2, i3, i4));
                    }
                };
                aypzVar.f(new ayrr() { // from class: zbu
                    @Override // defpackage.ayrr
                    public final void a() {
                        view2.removeOnLayoutChangeListener(onLayoutChangeListener);
                    }
                });
                if (!aypzVar.e()) {
                    aypzVar.d(new Rect(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom()));
                }
                view2.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        }).ai(ayqiVar);
    }

    public static void B(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = activity.getWindow().getDecorView();
        }
        if (currentFocus != null) {
            C(currentFocus);
        }
    }

    public static void C(View view) {
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void D(EditText editText) {
        Editable text = editText.getText();
        Selection.setSelection(text, text.length());
    }

    public static void E(View view, Drawable drawable) {
        F(view, drawable, 0);
    }

    public static void F(View view, Drawable drawable, int i) {
        boolean z = drawable instanceof zbv;
        if (!z || ((zbv) drawable).b != i) {
            Drawable x = x(view.getContext(), i);
            if (x == null) {
                r(view, drawable);
                return;
            } else {
                if (drawable == null) {
                    r(view, x);
                    return;
                }
                if (z) {
                    drawable = ((zbv) drawable).a;
                }
                r(view, new zbv(drawable, x, i));
                return;
            }
        }
        view.setBackground(drawable);
    }

    public static void G(TextView textView, CharSequence charSequence) {
        H(textView, charSequence, 0);
    }

    public static void H(TextView textView, CharSequence charSequence, int i) {
        textView.setText(charSequence);
        if (true == TextUtils.isEmpty(charSequence)) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public static void I(View view, boolean z) {
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        }
    }

    public static void J(View view) {
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        }
    }

    public static void K(Context context, int i, int i2) {
        if (context != null) {
            Toast.makeText(context.getApplicationContext(), i, i2).show();
        }
    }

    public static void L(Context context, CharSequence charSequence, int i) {
        if (context != null) {
            Toast.makeText(context.getApplicationContext(), charSequence, i).show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean M(View view, View view2) {
        if (view instanceof ViewParent) {
            return N((ViewParent) view, view2);
        }
        return view2 == view;
    }

    public static boolean N(ViewParent viewParent, View view) {
        while (view != null) {
            if (view != viewParent) {
                if (!(view.getParent() instanceof View)) {
                    return false;
                }
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void O(View view, boolean z, int i, zau zauVar) {
        zbj zbjVar;
        Drawable background = view.getBackground();
        if (background instanceof zbj) {
            zbjVar = (zbj) background;
        } else {
            view.setBackground(null);
            zbj zbjVar2 = new zbj(view.getContext(), background);
            r(view, zbjVar2);
            zbjVar = zbjVar2;
        }
        if (i != 0 && zauVar != null) {
            zauVar.b(zbjVar.getDrawable(1), i);
            zbjVar.invalidateSelf();
        }
        zbjVar.getDrawable(1).setAlpha(true != z ? 0 : PrivateKeyType.INVALID);
        zbjVar.invalidateSelf();
    }

    public static void P(ImageView imageView, int i) {
        boolean z = false;
        if (i >= 0 && i <= 255) {
            z = true;
        }
        amkq.E(z);
        imageView.getClass();
        imageView.setImageAlpha(i);
    }

    public static zbb Q(View view) {
        view.getClass();
        return new zbb(view);
    }

    public static double R(int i) {
        double red = Color.red(i);
        Double.isNaN(red);
        double d = red / 255.0d;
        double pow = d < 0.03928d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double green = Color.green(i);
        Double.isNaN(green);
        double d2 = green / 255.0d;
        double pow2 = d2 < 0.03928d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double blue = Color.blue(i);
        Double.isNaN(blue);
        double d3 = blue / 255.0d;
        return (pow * 0.2126d) + (pow2 * 0.7152d) + ((d3 < 0.03928d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d)) * 0.0722d);
    }

    public static int S(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }

    public static String T(apxf apxfVar) {
        if (apxfVar == null || !apxfVar.pY(BrowseEndpointOuterClass.browseEndpoint)) {
            return null;
        }
        return ((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).c;
    }

    public static void U(aasa aasaVar, arnd arndVar) {
        aasaVar.c(arndVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
    
        r1.put(r8.substring(0, r8.length() - 4), r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject V(defpackage.aooy r13) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whu.V(aooy):org.json.JSONObject");
    }

    public static FormatStreamModel W(Uri.Builder builder, String str, long j, aong aongVar) {
        String uri = builder.build().toString();
        aongVar.copyOnWrite();
        aqxz aqxzVar = (aqxz) aongVar.instance;
        aonv aonvVar = aqxz.a;
        uri.getClass();
        aqxzVar.c |= 2;
        aqxzVar.e = uri;
        return new FormatStreamModel((aqxz) aongVar.build(), str, j, false);
    }

    public static aooy X(aupw aupwVar) {
        if (aupwVar == null) {
            return null;
        }
        int i = aupwVar.b;
        if ((i & 1) != 0) {
            aupt auptVar = aupwVar.d;
            return auptVar == null ? aupt.a : auptVar;
        }
        if ((i & 2) != 0) {
            aupu aupuVar = aupwVar.e;
            return aupuVar == null ? aupu.a : aupuVar;
        }
        if ((i & 4) != 0) {
            aupy aupyVar = aupwVar.f;
            return aupyVar == null ? aupy.a : aupyVar;
        }
        if ((i & 8) != 0) {
            auqg auqgVar = aupwVar.g;
            return auqgVar == null ? auqg.a : auqgVar;
        }
        if ((i & 16) != 0) {
            auqh auqhVar = aupwVar.h;
            return auqhVar == null ? auqh.a : auqhVar;
        }
        if ((i & 32) != 0) {
            auqe auqeVar = aupwVar.i;
            return auqeVar == null ? auqe.a : auqeVar;
        }
        if ((i & 64) != 0) {
            auqj auqjVar = aupwVar.j;
            return auqjVar == null ? auqj.a : auqjVar;
        }
        if ((i & 128) != 0) {
            aupv aupvVar = aupwVar.k;
            return aupvVar == null ? aupv.a : aupvVar;
        }
        if ((i & 256) != 0) {
            aupm aupmVar = aupwVar.l;
            return aupmVar == null ? aupm.a : aupmVar;
        }
        if ((i & 512) != 0) {
            aqzy aqzyVar = aupwVar.m;
            return aqzyVar == null ? aqzy.a : aqzyVar;
        }
        if ((i & 1024) != 0) {
            arau arauVar = aupwVar.n;
            return arauVar == null ? arau.a : arauVar;
        }
        if ((i & 2048) != 0) {
            auqf auqfVar = aupwVar.o;
            return auqfVar == null ? auqf.a : auqfVar;
        }
        if ((i & 4096) != 0) {
            auql auqlVar = aupwVar.p;
            return auqlVar == null ? auql.a : auqlVar;
        }
        if ((i & 8192) != 0) {
            auqi auqiVar = aupwVar.q;
            return auqiVar == null ? auqi.a : auqiVar;
        }
        if ((i & 16384) != 0) {
            aupk aupkVar = aupwVar.r;
            return aupkVar == null ? aupk.a : aupkVar;
        }
        if ((32768 & i) != 0) {
            aupl auplVar = aupwVar.s;
            return auplVar == null ? aupl.a : auplVar;
        }
        if ((65536 & i) != 0) {
            aupp auppVar = aupwVar.t;
            return auppVar == null ? aupp.a : auppVar;
        }
        if ((131072 & i) != 0) {
            aups aupsVar = aupwVar.u;
            return aupsVar == null ? aups.a : aupsVar;
        }
        if ((262144 & i) != 0) {
            aupj aupjVar = aupwVar.v;
            return aupjVar == null ? aupj.a : aupjVar;
        }
        if ((524288 & i) != 0) {
            apum apumVar = aupwVar.w;
            return apumVar == null ? apum.a : apumVar;
        }
        if ((1048576 & i) != 0) {
            apuk apukVar = aupwVar.x;
            return apukVar == null ? apuk.a : apukVar;
        }
        if ((2097152 & i) != 0) {
            avqs avqsVar = aupwVar.y;
            return avqsVar == null ? avqs.a : avqsVar;
        }
        if ((4194304 & i) != 0) {
            avrc avrcVar = aupwVar.z;
            return avrcVar == null ? avrc.a : avrcVar;
        }
        if ((8388608 & i) != 0) {
            avnu avnuVar = aupwVar.A;
            return avnuVar == null ? avnu.a : avnuVar;
        }
        if ((16777216 & i) != 0) {
            avnw avnwVar = aupwVar.B;
            return avnwVar == null ? avnw.a : avnwVar;
        }
        if ((33554432 & i) != 0) {
            avnx avnxVar = aupwVar.C;
            return avnxVar == null ? avnx.a : avnxVar;
        }
        if ((67108864 & i) != 0) {
            avom avomVar = aupwVar.D;
            return avomVar == null ? avom.a : avomVar;
        }
        if ((134217728 & i) != 0) {
            avph avphVar = aupwVar.E;
            return avphVar == null ? avph.a : avphVar;
        }
        if ((268435456 & i) != 0) {
            auqq auqqVar = aupwVar.F;
            return auqqVar == null ? auqq.a : auqqVar;
        }
        if ((536870912 & i) != 0) {
            avpz avpzVar = aupwVar.G;
            return avpzVar == null ? avpz.a : avpzVar;
        }
        if ((1073741824 & i) != 0) {
            auqu auquVar = aupwVar.H;
            return auquVar == null ? auqu.a : auquVar;
        }
        if ((i & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
            auqr auqrVar = aupwVar.I;
            return auqrVar == null ? auqr.a : auqrVar;
        }
        int i2 = aupwVar.c;
        if ((i2 & 1) != 0) {
            auqo auqoVar = aupwVar.f127J;
            return auqoVar == null ? auqo.a : auqoVar;
        }
        if ((i2 & 2) != 0) {
            auqt auqtVar = aupwVar.K;
            return auqtVar == null ? auqt.a : auqtVar;
        }
        if ((i2 & 4) != 0) {
            avov avovVar = aupwVar.L;
            return avovVar == null ? avov.a : avovVar;
        }
        if ((i2 & 8) != 0) {
            auqp auqpVar = aupwVar.M;
            return auqpVar == null ? auqp.a : auqpVar;
        }
        if ((i2 & 16) != 0) {
            avor avorVar = aupwVar.N;
            return avorVar == null ? avor.a : avorVar;
        }
        if ((i2 & 32) != 0) {
            auqm auqmVar = aupwVar.O;
            return auqmVar == null ? auqm.a : auqmVar;
        }
        if ((i2 & 64) != 0) {
            aupn aupnVar = aupwVar.P;
            return aupnVar == null ? aupn.a : aupnVar;
        }
        if ((i2 & 128) != 0) {
            auqn auqnVar = aupwVar.Q;
            return auqnVar == null ? auqn.a : auqnVar;
        }
        if ((i2 & 256) == 0) {
            return null;
        }
        aupo aupoVar = aupwVar.R;
        return aupoVar == null ? aupo.a : aupoVar;
    }

    public static aooy Y(auoy auoyVar) {
        if (auoyVar == null) {
            return null;
        }
        int i = auoyVar.b;
        if ((i & 1) != 0) {
            avzi avziVar = auoyVar.f;
            return avziVar == null ? avzi.a : avziVar;
        }
        if ((i & 2) != 0) {
            avzy avzyVar = auoyVar.g;
            return avzyVar == null ? avzy.a : avzyVar;
        }
        if ((i & 4) != 0) {
            apmg apmgVar = auoyVar.h;
            return apmgVar == null ? apmg.a : apmgVar;
        }
        if ((i & 8) != 0) {
            aqvm aqvmVar = auoyVar.i;
            return aqvmVar == null ? aqvm.a : aqvmVar;
        }
        if ((i & 16) != 0) {
            askd askdVar = auoyVar.j;
            return askdVar == null ? askd.a : askdVar;
        }
        if ((i & 32) != 0) {
            asjw asjwVar = auoyVar.k;
            return asjwVar == null ? asjw.a : asjwVar;
        }
        if ((i & 64) != 0) {
            arcz arczVar = auoyVar.l;
            return arczVar == null ? arcz.a : arczVar;
        }
        if ((i & 128) != 0) {
            apzs apzsVar = auoyVar.m;
            return apzsVar == null ? apzs.a : apzsVar;
        }
        if ((i & 256) != 0) {
            apzx apzxVar = auoyVar.n;
            return apzxVar == null ? apzx.a : apzxVar;
        }
        if ((i & 512) != 0) {
            aqak aqakVar = auoyVar.o;
            return aqakVar == null ? aqak.a : aqakVar;
        }
        if ((i & 1024) != 0) {
            aqae aqaeVar = auoyVar.p;
            return aqaeVar == null ? aqae.a : aqaeVar;
        }
        if ((i & 2048) != 0) {
            aqdd aqddVar = auoyVar.q;
            return aqddVar == null ? aqdd.a : aqddVar;
        }
        if ((i & 4096) != 0) {
            audc audcVar = auoyVar.r;
            return audcVar == null ? audc.a : audcVar;
        }
        if ((i & 8192) != 0) {
            aulx aulxVar = auoyVar.s;
            return aulxVar == null ? aulx.a : aulxVar;
        }
        if ((i & 16384) != 0) {
            aufl auflVar = auoyVar.t;
            return auflVar == null ? aufl.a : auflVar;
        }
        if ((i & 32768) != 0) {
            auso ausoVar = auoyVar.u;
            return ausoVar == null ? auso.a : ausoVar;
        }
        if ((i & 65536) != 0) {
            ausu ausuVar = auoyVar.v;
            return ausuVar == null ? ausu.a : ausuVar;
        }
        if ((i & 131072) != 0) {
            aqlh aqlhVar = auoyVar.w;
            return aqlhVar == null ? aqlh.a : aqlhVar;
        }
        if ((i & 262144) != 0) {
            ause auseVar = auoyVar.x;
            return auseVar == null ? ause.a : auseVar;
        }
        if ((i & 524288) != 0) {
            avct avctVar = auoyVar.y;
            return avctVar == null ? avct.a : avctVar;
        }
        if ((i & 1048576) != 0) {
            avcv avcvVar = auoyVar.z;
            return avcvVar == null ? avcv.a : avcvVar;
        }
        if ((i & 2097152) != 0) {
            avcq avcqVar = auoyVar.A;
            return avcqVar == null ? avcq.a : avcqVar;
        }
        if ((4194304 & i) != 0) {
            avcp avcpVar = auoyVar.B;
            return avcpVar == null ? avcp.a : avcpVar;
        }
        if ((8388608 & i) != 0) {
            awdv awdvVar = auoyVar.C;
            return awdvVar == null ? awdv.a : awdvVar;
        }
        if ((16777216 & i) != 0) {
            atpj atpjVar = auoyVar.D;
            return atpjVar == null ? atpj.a : atpjVar;
        }
        if ((33554432 & i) != 0) {
            atqc atqcVar = auoyVar.E;
            return atqcVar == null ? atqc.a : atqcVar;
        }
        if ((67108864 & i) != 0) {
            atts attsVar = auoyVar.F;
            return attsVar == null ? atts.a : attsVar;
        }
        if ((134217728 & i) != 0) {
            aove aoveVar = auoyVar.G;
            return aoveVar == null ? aove.a : aoveVar;
        }
        if ((268435456 & i) != 0) {
            atdw atdwVar = auoyVar.H;
            return atdwVar == null ? atdw.a : atdwVar;
        }
        if ((536870912 & i) != 0) {
            apcg apcgVar = auoyVar.I;
            return apcgVar == null ? apcg.a : apcgVar;
        }
        if ((1073741824 & i) != 0) {
            apcb apcbVar = auoyVar.f126J;
            return apcbVar == null ? apcb.a : apcbVar;
        }
        if ((i & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
            aqhz aqhzVar = auoyVar.K;
            return aqhzVar == null ? aqhz.a : aqhzVar;
        }
        int i2 = auoyVar.c;
        if ((i2 & 1) != 0) {
            aozp aozpVar = auoyVar.L;
            return aozpVar == null ? aozp.a : aozpVar;
        }
        if ((i2 & 2) != 0) {
            aqfe aqfeVar = auoyVar.M;
            return aqfeVar == null ? aqfe.a : aqfeVar;
        }
        if ((i2 & 4) != 0) {
            aqga aqgaVar = auoyVar.N;
            return aqgaVar == null ? aqga.a : aqgaVar;
        }
        if ((i2 & 8) != 0) {
            atvk atvkVar = auoyVar.O;
            return atvkVar == null ? atvk.a : atvkVar;
        }
        if ((i2 & 16) != 0) {
            aozl aozlVar = auoyVar.P;
            return aozlVar == null ? aozl.a : aozlVar;
        }
        if ((i2 & 32) != 0) {
            atid atidVar = auoyVar.Q;
            return atidVar == null ? atid.a : atidVar;
        }
        if ((i2 & 64) != 0) {
            asso assoVar = auoyVar.R;
            return assoVar == null ? asso.a : assoVar;
        }
        if ((i2 & 128) != 0) {
            assp asspVar = auoyVar.S;
            return asspVar == null ? assp.a : asspVar;
        }
        if ((i2 & 256) != 0) {
            assl asslVar = auoyVar.T;
            return asslVar == null ? assl.a : asslVar;
        }
        if ((i2 & 512) != 0) {
            assv assvVar = auoyVar.U;
            return assvVar == null ? assv.a : assvVar;
        }
        if ((i2 & 1024) != 0) {
            asok asokVar = auoyVar.V;
            return asokVar == null ? asok.a : asokVar;
        }
        if ((i2 & 2048) != 0) {
            assk asskVar = auoyVar.W;
            return asskVar == null ? assk.a : asskVar;
        }
        if ((i2 & 4096) != 0) {
            assq assqVar = auoyVar.X;
            return assqVar == null ? assq.a : assqVar;
        }
        if ((i2 & 8192) != 0) {
            assx assxVar = auoyVar.Y;
            return assxVar == null ? assx.a : assxVar;
        }
        if ((i2 & 16384) != 0) {
            arfa arfaVar = auoyVar.Z;
            return arfaVar == null ? arfa.a : arfaVar;
        }
        if ((i2 & 32768) != 0) {
            avnj avnjVar = auoyVar.aa;
            return avnjVar == null ? avnj.a : avnjVar;
        }
        if ((i2 & 65536) != 0) {
            atqr atqrVar = auoyVar.ab;
            return atqrVar == null ? atqr.a : atqrVar;
        }
        if ((i2 & 131072) != 0) {
            apqm apqmVar = auoyVar.ac;
            return apqmVar == null ? apqm.a : apqmVar;
        }
        if ((i2 & 262144) != 0) {
            atih atihVar = auoyVar.ad;
            return atihVar == null ? atih.a : atihVar;
        }
        if ((i2 & 524288) != 0) {
            atim atimVar = auoyVar.ae;
            return atimVar == null ? atim.a : atimVar;
        }
        if ((i2 & 1048576) != 0) {
            atka atkaVar = auoyVar.af;
            return atkaVar == null ? atka.a : atkaVar;
        }
        if ((i2 & 2097152) != 0) {
            atku atkuVar = auoyVar.ag;
            return atkuVar == null ? atku.a : atkuVar;
        }
        if ((4194304 & i2) != 0) {
            atkr atkrVar = auoyVar.ah;
            return atkrVar == null ? atkr.a : atkrVar;
        }
        if ((8388608 & i2) != 0) {
            atkx atkxVar = auoyVar.ai;
            return atkxVar == null ? atkx.a : atkxVar;
        }
        if ((16777216 & i2) != 0) {
            atjx atjxVar = auoyVar.aj;
            return atjxVar == null ? atjx.a : atjxVar;
        }
        if ((33554432 & i2) != 0) {
            atla atlaVar = auoyVar.ak;
            return atlaVar == null ? atla.a : atlaVar;
        }
        if ((67108864 & i2) != 0) {
            atjn atjnVar = auoyVar.al;
            return atjnVar == null ? atjn.a : atjnVar;
        }
        if ((134217728 & i2) != 0) {
            ativ ativVar = auoyVar.am;
            return ativVar == null ? ativ.a : ativVar;
        }
        if ((268435456 & i2) != 0) {
            atii atiiVar = auoyVar.an;
            return atiiVar == null ? atii.a : atiiVar;
        }
        if ((536870912 & i2) != 0) {
            atjd atjdVar = auoyVar.ao;
            return atjdVar == null ? atjd.a : atjdVar;
        }
        if ((1073741824 & i2) != 0) {
            atks atksVar = auoyVar.ap;
            return atksVar == null ? atks.a : atksVar;
        }
        if ((i2 & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
            atiq atiqVar = auoyVar.aq;
            return atiqVar == null ? atiq.a : atiqVar;
        }
        int i3 = auoyVar.d;
        if ((i3 & 1) != 0) {
            atkz atkzVar = auoyVar.ar;
            return atkzVar == null ? atkz.a : atkzVar;
        }
        if ((i3 & 2) != 0) {
            aqgn aqgnVar = auoyVar.as;
            return aqgnVar == null ? aqgn.a : aqgnVar;
        }
        if ((i3 & 4) != 0) {
            aptj aptjVar = auoyVar.at;
            return aptjVar == null ? aptj.a : aptjVar;
        }
        if ((i3 & 8) != 0) {
            avnn avnnVar = auoyVar.au;
            return avnnVar == null ? avnn.a : avnnVar;
        }
        if ((i3 & 16) != 0) {
            avnp avnpVar = auoyVar.av;
            return avnpVar == null ? avnp.a : avnpVar;
        }
        if ((i3 & 32) != 0) {
            avpg avpgVar = auoyVar.aw;
            return avpgVar == null ? avpg.a : avpgVar;
        }
        if ((i3 & 64) != 0) {
            avpi avpiVar = auoyVar.ax;
            return avpiVar == null ? avpi.a : avpiVar;
        }
        if ((i3 & 128) != 0) {
            avpo avpoVar = auoyVar.ay;
            return avpoVar == null ? avpo.a : avpoVar;
        }
        if ((i3 & 256) != 0) {
            avrn avrnVar = auoyVar.az;
            return avrnVar == null ? avrn.a : avrnVar;
        }
        if ((i3 & 512) != 0) {
            avro avroVar = auoyVar.aA;
            return avroVar == null ? avro.a : avroVar;
        }
        if ((i3 & 1024) != 0) {
            avrp avrpVar = auoyVar.aB;
            return avrpVar == null ? avrp.a : avrpVar;
        }
        if ((i3 & 2048) != 0) {
            avre avreVar = auoyVar.aC;
            return avreVar == null ? avre.a : avreVar;
        }
        if ((i3 & 4096) != 0) {
            avok avokVar = auoyVar.aD;
            return avokVar == null ? avok.a : avokVar;
        }
        if ((i3 & 8192) != 0) {
            avor avorVar = auoyVar.aE;
            return avorVar == null ? avor.a : avorVar;
        }
        if ((i3 & 16384) != 0) {
            avou avouVar = auoyVar.aF;
            return avouVar == null ? avou.a : avouVar;
        }
        if ((i3 & 32768) != 0) {
            avoz avozVar = auoyVar.aG;
            return avozVar == null ? avoz.a : avozVar;
        }
        if ((i3 & 65536) != 0) {
            avri avriVar = auoyVar.aH;
            return avriVar == null ? avri.a : avriVar;
        }
        if ((i3 & 131072) != 0) {
            avog avogVar = auoyVar.aI;
            return avogVar == null ? avog.a : avogVar;
        }
        if ((i3 & 262144) != 0) {
            avof avofVar = auoyVar.aJ;
            return avofVar == null ? avof.a : avofVar;
        }
        if ((i3 & 524288) != 0) {
            avrb avrbVar = auoyVar.aK;
            return avrbVar == null ? avrb.a : avrbVar;
        }
        if ((i3 & 1048576) != 0) {
            avqt avqtVar = auoyVar.aL;
            return avqtVar == null ? avqt.a : avqtVar;
        }
        if ((i3 & 2097152) != 0) {
            avoc avocVar = auoyVar.aM;
            return avocVar == null ? avoc.a : avocVar;
        }
        if ((4194304 & i3) != 0) {
            atdn atdnVar = auoyVar.aN;
            return atdnVar == null ? atdn.a : atdnVar;
        }
        if ((8388608 & i3) != 0) {
            aubs aubsVar = auoyVar.aO;
            return aubsVar == null ? aubs.a : aubsVar;
        }
        if ((16777216 & i3) != 0) {
            aumc aumcVar = auoyVar.aP;
            return aumcVar == null ? aumc.a : aumcVar;
        }
        if ((33554432 & i3) != 0) {
            aram aramVar = auoyVar.aQ;
            return aramVar == null ? aram.a : aramVar;
        }
        if ((67108864 & i3) != 0) {
            araa araaVar = auoyVar.aR;
            return araaVar == null ? araa.a : araaVar;
        }
        if ((134217728 & i3) != 0) {
            aral aralVar = auoyVar.aS;
            return aralVar == null ? aral.a : aralVar;
        }
        if ((268435456 & i3) != 0) {
            arah arahVar = auoyVar.aT;
            return arahVar == null ? arah.a : arahVar;
        }
        if ((536870912 & i3) != 0) {
            appf appfVar = auoyVar.aU;
            return appfVar == null ? appf.a : appfVar;
        }
        if ((1073741824 & i3) != 0) {
            auio auioVar = auoyVar.aV;
            return auioVar == null ? auio.a : auioVar;
        }
        if ((i3 & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
            atlv atlvVar = auoyVar.aW;
            return atlvVar == null ? atlv.a : atlvVar;
        }
        int i4 = auoyVar.e;
        if ((i4 & 1) != 0) {
            awcd awcdVar = auoyVar.aX;
            return awcdVar == null ? awcd.a : awcdVar;
        }
        if ((i4 & 2) != 0) {
            avgp avgpVar = auoyVar.aY;
            return avgpVar == null ? avgp.a : avgpVar;
        }
        if ((i4 & 4) != 0) {
            atdm atdmVar = auoyVar.aZ;
            return atdmVar == null ? atdm.a : atdmVar;
        }
        if ((i4 & 8) != 0) {
            apux apuxVar = auoyVar.ba;
            return apuxVar == null ? apux.a : apuxVar;
        }
        if ((i4 & 16) != 0) {
            aqeb aqebVar = auoyVar.bb;
            return aqebVar == null ? aqeb.a : aqebVar;
        }
        if ((i4 & 32) != 0) {
            atkk atkkVar = auoyVar.bc;
            return atkkVar == null ? atkk.a : atkkVar;
        }
        if ((i4 & 64) != 0) {
            aumd aumdVar = auoyVar.bd;
            return aumdVar == null ? aumd.a : aumdVar;
        }
        if ((i4 & 128) != 0) {
            atsz atszVar = auoyVar.be;
            return atszVar == null ? atsz.a : atszVar;
        }
        if ((i4 & 256) != 0) {
            aqlc aqlcVar = auoyVar.bf;
            return aqlcVar == null ? aqlc.a : aqlcVar;
        }
        if ((i4 & 512) != 0) {
            auxe auxeVar = auoyVar.bg;
            return auxeVar == null ? auxe.a : auxeVar;
        }
        if ((i4 & 1024) != 0) {
            aupv aupvVar = auoyVar.bh;
            return aupvVar == null ? aupv.a : aupvVar;
        }
        if ((i4 & 2048) != 0) {
            aqdg aqdgVar = auoyVar.bi;
            return aqdgVar == null ? aqdg.a : aqdgVar;
        }
        if ((i4 & 4096) != 0) {
            avkj avkjVar = auoyVar.bj;
            return avkjVar == null ? avkj.a : avkjVar;
        }
        if ((i4 & 8192) != 0) {
            atip atipVar = auoyVar.bk;
            return atipVar == null ? atip.a : atipVar;
        }
        if ((i4 & 16384) != 0) {
            aqlf aqlfVar = auoyVar.bl;
            return aqlfVar == null ? aqlf.a : aqlfVar;
        }
        if ((32768 & i4) != 0) {
            auwd auwdVar = auoyVar.bm;
            return auwdVar == null ? auwd.a : auwdVar;
        }
        if ((i4 & 65536) != 0) {
            awbi awbiVar = auoyVar.bn;
            return awbiVar == null ? awbi.a : awbiVar;
        }
        if ((i4 & 131072) != 0) {
            arbt arbtVar = auoyVar.bo;
            return arbtVar == null ? arbt.a : arbtVar;
        }
        if ((i4 & 262144) != 0) {
            apfw apfwVar = auoyVar.bp;
            return apfwVar == null ? apfw.a : apfwVar;
        }
        if ((i4 & 524288) != 0) {
            apfx apfxVar = auoyVar.bq;
            return apfxVar == null ? apfx.a : apfxVar;
        }
        if ((i4 & 1048576) != 0) {
            aqvr aqvrVar = auoyVar.br;
            return aqvrVar == null ? aqvr.a : aqvrVar;
        }
        if ((i4 & 2097152) != 0) {
            apre apreVar = auoyVar.bs;
            return apreVar == null ? apre.a : apreVar;
        }
        if ((4194304 & i4) != 0) {
            atth atthVar = auoyVar.bt;
            return atthVar == null ? atth.a : atthVar;
        }
        if ((8388608 & i4) != 0) {
            aqex aqexVar = auoyVar.bu;
            return aqexVar == null ? aqex.a : aqexVar;
        }
        if ((16777216 & i4) != 0) {
            aufs aufsVar = auoyVar.bv;
            return aufsVar == null ? aufs.a : aufsVar;
        }
        if ((33554432 & i4) != 0) {
            asmz asmzVar = auoyVar.bw;
            return asmzVar == null ? asmz.a : asmzVar;
        }
        if ((67108864 & i4) != 0) {
            atki atkiVar = auoyVar.bx;
            return atkiVar == null ? atki.a : atkiVar;
        }
        if ((134217728 & i4) != 0) {
            argc argcVar = auoyVar.by;
            return argcVar == null ? argc.a : argcVar;
        }
        if ((268435456 & i4) != 0) {
            aqba aqbaVar = auoyVar.bz;
            return aqbaVar == null ? aqba.a : aqbaVar;
        }
        if ((536870912 & i4) != 0) {
            atem atemVar = auoyVar.bA;
            return atemVar == null ? atem.a : atemVar;
        }
        if ((i4 & 1073741824) == 0) {
            return null;
        }
        aten atenVar = auoyVar.bB;
        return atenVar == null ? aten.a : atenVar;
    }

    public static aooy Z(askg askgVar) {
        if (askgVar == null) {
            return null;
        }
        int i = askgVar.b;
        if ((i & 1) != 0) {
            aslv aslvVar = askgVar.l;
            return aslvVar == null ? aslv.a : aslvVar;
        }
        if ((i & 2) != 0) {
            aslq aslqVar = askgVar.m;
            return aslqVar == null ? aslq.a : aslqVar;
        }
        if ((i & 4) != 0) {
            aqdb aqdbVar = askgVar.n;
            return aqdbVar == null ? aqdb.a : aqdbVar;
        }
        if ((i & 8) != 0) {
            aqgn aqgnVar = askgVar.o;
            return aqgnVar == null ? aqgn.a : aqgnVar;
        }
        if ((i & 16) != 0) {
            aqco aqcoVar = askgVar.p;
            return aqcoVar == null ? aqco.a : aqcoVar;
        }
        if ((i & 32) != 0) {
            aqbj aqbjVar = askgVar.q;
            return aqbjVar == null ? aqbj.a : aqbjVar;
        }
        if ((i & 64) != 0) {
            aqcj aqcjVar = askgVar.r;
            return aqcjVar == null ? aqcj.a : aqcjVar;
        }
        if ((i & 128) != 0) {
            aqcv aqcvVar = askgVar.s;
            return aqcvVar == null ? aqcv.a : aqcvVar;
        }
        if ((i & 256) != 0) {
            aqcq aqcqVar = askgVar.t;
            return aqcqVar == null ? aqcq.a : aqcqVar;
        }
        if ((i & 512) != 0) {
            aqck aqckVar = askgVar.u;
            return aqckVar == null ? aqck.a : aqckVar;
        }
        if ((i & 1024) != 0) {
            aqcp aqcpVar = askgVar.v;
            return aqcpVar == null ? aqcp.a : aqcpVar;
        }
        if ((i & 2048) != 0) {
            aqca aqcaVar = askgVar.w;
            return aqcaVar == null ? aqca.a : aqcaVar;
        }
        if ((i & 4096) != 0) {
            aqbw aqbwVar = askgVar.x;
            return aqbwVar == null ? aqbw.a : aqbwVar;
        }
        if ((i & 8192) != 0) {
            aqcy aqcyVar = askgVar.y;
            return aqcyVar == null ? aqcy.a : aqcyVar;
        }
        if ((i & 16384) != 0) {
            aqch aqchVar = askgVar.z;
            return aqchVar == null ? aqch.a : aqchVar;
        }
        if ((32768 & i) != 0) {
            atmo atmoVar = askgVar.A;
            return atmoVar == null ? atmo.a : atmoVar;
        }
        if ((65536 & i) != 0) {
            avzv avzvVar = askgVar.B;
            return avzvVar == null ? avzv.a : avzvVar;
        }
        if ((131072 & i) != 0) {
            awal awalVar = askgVar.C;
            return awalVar == null ? awal.a : awalVar;
        }
        if ((262144 & i) != 0) {
            apsa apsaVar = askgVar.D;
            return apsaVar == null ? apsa.a : apsaVar;
        }
        if ((524288 & i) != 0) {
            atha athaVar = askgVar.E;
            return athaVar == null ? atha.a : athaVar;
        }
        if ((1048576 & i) != 0) {
            aubz aubzVar = askgVar.F;
            return aubzVar == null ? aubz.a : aubzVar;
        }
        if ((2097152 & i) != 0) {
            auip auipVar = askgVar.G;
            return auipVar == null ? auip.a : auipVar;
        }
        if ((4194304 & i) != 0) {
            auuf auufVar = askgVar.H;
            return auufVar == null ? auuf.a : auufVar;
        }
        if ((8388608 & i) != 0) {
            auvw auvwVar = askgVar.I;
            return auvwVar == null ? auvw.a : auvwVar;
        }
        if ((16777216 & i) != 0) {
            auxu auxuVar = askgVar.f112J;
            return auxuVar == null ? auxu.a : auxuVar;
        }
        if ((33554432 & i) != 0) {
            auny aunyVar = askgVar.K;
            return aunyVar == null ? auny.a : aunyVar;
        }
        if ((67108864 & i) != 0) {
            aunt auntVar = askgVar.L;
            return auntVar == null ? aunt.a : auntVar;
        }
        if ((134217728 & i) != 0) {
            aqgh aqghVar = askgVar.M;
            return aqghVar == null ? aqgh.a : aqghVar;
        }
        if ((268435456 & i) != 0) {
            aqgj aqgjVar = askgVar.N;
            return aqgjVar == null ? aqgj.a : aqgjVar;
        }
        if ((536870912 & i) != 0) {
            aqgm aqgmVar = askgVar.O;
            return aqgmVar == null ? aqgm.a : aqgmVar;
        }
        if ((1073741824 & i) != 0) {
            aqgi aqgiVar = askgVar.P;
            return aqgiVar == null ? aqgi.a : aqgiVar;
        }
        if ((i & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
            aqgk aqgkVar = askgVar.Q;
            return aqgkVar == null ? aqgk.a : aqgkVar;
        }
        int i2 = askgVar.c;
        if ((i2 & 1) != 0) {
            aqgl aqglVar = askgVar.R;
            return aqglVar == null ? aqgl.a : aqglVar;
        }
        if ((i2 & 2) != 0) {
            auoc auocVar = askgVar.S;
            return auocVar == null ? auoc.a : auocVar;
        }
        if (askgVar.ga()) {
            return askgVar.aP();
        }
        if (askgVar.jc()) {
            return askgVar.eg();
        }
        if (askgVar.jw()) {
            return askgVar.ei();
        }
        if (askgVar.eC()) {
            return askgVar.ee();
        }
        if (askgVar.ix()) {
            return askgVar.ef();
        }
        if (askgVar.jv()) {
            return askgVar.eh();
        }
        if (askgVar.js()) {
            return askgVar.eb();
        }
        if (askgVar.jt()) {
            return askgVar.ec();
        }
        if (askgVar.jr()) {
            return askgVar.ea();
        }
        if (askgVar.jp()) {
            return askgVar.dY();
        }
        if (askgVar.fx()) {
            return askgVar.al();
        }
        if (askgVar.fs()) {
            return askgVar.ag();
        }
        if (askgVar.fp()) {
            return askgVar.ac();
        }
        if (askgVar.fq()) {
            return askgVar.ad();
        }
        if (askgVar.fr()) {
            return askgVar.ae();
        }
        if (askgVar.ft()) {
            return askgVar.ah();
        }
        if (askgVar.fu()) {
            return askgVar.ai();
        }
        if (askgVar.gL()) {
            return askgVar.bA();
        }
        if (askgVar.ge()) {
            return askgVar.aT();
        }
        if (askgVar.gw()) {
            return askgVar.bl();
        }
        if (askgVar.jm()) {
            return askgVar.dV();
        }
        if (askgVar.gA()) {
            return askgVar.bp();
        }
        if (askgVar.gf()) {
            return askgVar.aU();
        }
        if (askgVar.ff()) {
            return askgVar.T();
        }
        if (askgVar.hh()) {
            return askgVar.bW();
        }
        if (askgVar.gq()) {
            return askgVar.bf();
        }
        if (askgVar.iw()) {
            return askgVar.di();
        }
        if (askgVar.hi()) {
            return askgVar.dh();
        }
        if (askgVar.eW()) {
            return askgVar.K();
        }
        if (askgVar.eV()) {
            return askgVar.J();
        }
        if (askgVar.eY()) {
            return askgVar.M();
        }
        if (askgVar.eX()) {
            return askgVar.L();
        }
        if (askgVar.hw()) {
            return askgVar.cg();
        }
        if (askgVar.hy()) {
            return askgVar.ci();
        }
        if (askgVar.hz()) {
            return askgVar.cj();
        }
        if (askgVar.hx()) {
            return askgVar.ch();
        }
        if (askgVar.gS()) {
            return askgVar.bH();
        }
        if (askgVar.fZ()) {
            return askgVar.aO();
        }
        if (askgVar.ih()) {
            return askgVar.cR();
        }
        if (askgVar.ig()) {
            return askgVar.cQ();
        }
        if (askgVar.gT()) {
            return askgVar.bI();
        }
        if (askgVar.fE()) {
            return askgVar.as();
        }
        if (askgVar.ii()) {
            return askgVar.cS();
        }
        if (askgVar.jb()) {
            return askgVar.dL();
        }
        if (askgVar.fi()) {
            return askgVar.W();
        }
        if (askgVar.fa()) {
            return askgVar.O();
        }
        if (askgVar.fQ()) {
            return askgVar.aF();
        }
        if (askgVar.fR()) {
            return askgVar.aG();
        }
        if (askgVar.fX()) {
            return askgVar.aM();
        }
        if (askgVar.gd()) {
            return askgVar.aS();
        }
        if (askgVar.hb()) {
            return askgVar.bQ();
        }
        if (askgVar.ha()) {
            return askgVar.bP();
        }
        if (askgVar.gZ()) {
            return askgVar.bO();
        }
        if (askgVar.eZ()) {
            return askgVar.N();
        }
        if (askgVar.eK()) {
            return askgVar.v();
        }
        if (askgVar.gz()) {
            return askgVar.bo();
        }
        if (askgVar.fh()) {
            return askgVar.V();
        }
        if (askgVar.hj()) {
            return askgVar.bX();
        }
        if (askgVar.fF()) {
            return askgVar.at();
        }
        if (askgVar.fG()) {
            return askgVar.au();
        }
        if (askgVar.fH()) {
            return askgVar.av();
        }
        if (askgVar.iv()) {
            return askgVar.dg();
        }
        if (askgVar.fe()) {
            return askgVar.S();
        }
        if (askgVar.ij()) {
            return askgVar.cT();
        }
        if (askgVar.gn()) {
            return askgVar.bc();
        }
        if (askgVar.fI()) {
            return askgVar.aw();
        }
        if (askgVar.fJ()) {
            return askgVar.ax();
        }
        if (askgVar.jB()) {
            return askgVar.en();
        }
        if (askgVar.iq()) {
            return askgVar.da();
        }
        if (askgVar.jq()) {
            return askgVar.dZ();
        }
        if (askgVar.gp()) {
            return askgVar.be();
        }
        if (askgVar.ir()) {
            return askgVar.db();
        }
        if (askgVar.iZ()) {
            return askgVar.dJ();
        }
        if (askgVar.fD()) {
            return askgVar.ar();
        }
        if (askgVar.eF()) {
            return askgVar.q();
        }
        if (askgVar.eG()) {
            return askgVar.r();
        }
        if (askgVar.eJ()) {
            return askgVar.u();
        }
        if (askgVar.eH()) {
            return askgVar.s();
        }
        if (askgVar.eI()) {
            return askgVar.t();
        }
        if (askgVar.fA()) {
            return askgVar.ao();
        }
        if (askgVar.gi()) {
            return askgVar.aX();
        }
        if (askgVar.fB()) {
            return askgVar.ap();
        }
        if (askgVar.fC()) {
            return askgVar.aq();
        }
        if (askgVar.iy()) {
            return askgVar.dj();
        }
        if (askgVar.iz()) {
            return askgVar.dk();
        }
        if (askgVar.iL()) {
            return askgVar.dw();
        }
        if (askgVar.gu()) {
            return askgVar.bj();
        }
        if (askgVar.hr()) {
            return askgVar.aA();
        }
        if (askgVar.fM()) {
            return askgVar.az();
        }
        if (askgVar.iQ()) {
            return askgVar.aB();
        }
        if (askgVar.hg()) {
            return askgVar.bV();
        }
        if (askgVar.gY()) {
            return askgVar.bN();
        }
        if (askgVar.gW()) {
            return askgVar.bL();
        }
        if (askgVar.hf()) {
            return askgVar.bU();
        }
        if (askgVar.gX()) {
            return askgVar.bM();
        }
        if (askgVar.gV()) {
            return askgVar.bK();
        }
        if (askgVar.he()) {
            return askgVar.bT();
        }
        if (askgVar.hc()) {
            return askgVar.bR();
        }
        if (askgVar.gU()) {
            return askgVar.bJ();
        }
        if (askgVar.fc()) {
            return askgVar.Q();
        }
        if (askgVar.hu()) {
            return askgVar.ce();
        }
        if (askgVar.hv()) {
            return askgVar.cf();
        }
        if (askgVar.jA()) {
            return askgVar.em();
        }
        if (askgVar.eL()) {
            return askgVar.w();
        }
        if (askgVar.jd()) {
            return askgVar.dM();
        }
        if (askgVar.jg()) {
            return askgVar.dQ();
        }
        if (askgVar.jh()) {
            return askgVar.dN();
        }
        if (askgVar.hE()) {
            return askgVar.co();
        }
        if (askgVar.hF()) {
            return askgVar.cp();
        }
        if (askgVar.hG()) {
            return askgVar.cq();
        }
        if (askgVar.hH()) {
            return askgVar.cr();
        }
        if (askgVar.hJ()) {
            return askgVar.ct();
        }
        if (askgVar.hK()) {
            return askgVar.cu();
        }
        if (askgVar.hL()) {
            return askgVar.cv();
        }
        if (askgVar.hR()) {
            return askgVar.cB();
        }
        if (askgVar.hS()) {
            return askgVar.cC();
        }
        if (askgVar.hU()) {
            return askgVar.cE();
        }
        if (askgVar.ib()) {
            return askgVar.cL();
        }
        if (askgVar.ic()) {
            return askgVar.cM();
        }
        if (askgVar.id()) {
            return askgVar.cN();
        }
        if (askgVar.hV()) {
            return askgVar.cF();
        }
        if (askgVar.hW()) {
            return askgVar.cG();
        }
        if (askgVar.hX()) {
            return askgVar.cH();
        }
        if (askgVar.hY()) {
            return askgVar.cI();
        }
        if (askgVar.hN()) {
            return askgVar.cx();
        }
        if (askgVar.hM()) {
            return askgVar.cw();
        }
        if (askgVar.hT()) {
            return askgVar.cD();
        }
        if (askgVar.hO()) {
            return askgVar.cy();
        }
        if (askgVar.hQ()) {
            return askgVar.cA();
        }
        if (askgVar.hP()) {
            return askgVar.cz();
        }
        if (askgVar.hZ()) {
            return askgVar.cJ();
        }
        if (askgVar.ia()) {
            return askgVar.cK();
        }
        if (askgVar.hI()) {
            return askgVar.cs();
        }
        if (askgVar.m33if()) {
            return askgVar.cP();
        }
        if (askgVar.ie()) {
            return askgVar.cO();
        }
        if (askgVar.iN()) {
            return askgVar.dy();
        }
        if (askgVar.iO()) {
            return askgVar.dz();
        }
        if (askgVar.iP()) {
            return askgVar.dA();
        }
        if (askgVar.jj()) {
            return askgVar.dS();
        }
        if (askgVar.ji()) {
            return askgVar.dR();
        }
        if (askgVar.jk()) {
            return askgVar.dT();
        }
        if (askgVar.jl()) {
            return askgVar.dU();
        }
        if (askgVar.jf()) {
            return askgVar.dP();
        }
        if (askgVar.je()) {
            return askgVar.dO();
        }
        if (askgVar.gj()) {
            return askgVar.aY();
        }
        if (askgVar.gm()) {
            return askgVar.bb();
        }
        if (askgVar.gk()) {
            return askgVar.aZ();
        }
        if (askgVar.gl()) {
            return askgVar.ba();
        }
        if (askgVar.fo()) {
            return askgVar.af();
        }
        if (askgVar.iX()) {
            return askgVar.dH();
        }
        if (askgVar.gB()) {
            return askgVar.bq();
        }
        if (askgVar.jn()) {
            return askgVar.dW();
        }
        if (askgVar.jo()) {
            return askgVar.dX();
        }
        if (askgVar.it()) {
            return askgVar.dd();
        }
        if (askgVar.gO()) {
            return askgVar.bD();
        }
        if (askgVar.iR()) {
            return askgVar.dB();
        }
        if (askgVar.gN()) {
            return askgVar.bC();
        }
        if (askgVar.fb()) {
            return askgVar.P();
        }
        if (askgVar.fV()) {
            return askgVar.aK();
        }
        if (askgVar.fP()) {
            return askgVar.aE();
        }
        if (askgVar.fz()) {
            return askgVar.an();
        }
        if (askgVar.iS()) {
            return askgVar.dC();
        }
        if (askgVar.gR()) {
            return askgVar.bG();
        }
        if (askgVar.ik()) {
            return askgVar.cU();
        }
        if (askgVar.gt()) {
            return askgVar.bi();
        }
        if (askgVar.eU()) {
            return askgVar.I();
        }
        if (askgVar.go()) {
            return askgVar.bd();
        }
        if (askgVar.is()) {
            return askgVar.dc();
        }
        if (askgVar.fd()) {
            return askgVar.R();
        }
        if (askgVar.fN()) {
            return askgVar.aC();
        }
        if (askgVar.eP()) {
            return askgVar.A();
        }
        if (askgVar.ex()) {
            return askgVar.j();
        }
        if (askgVar.hs()) {
            return askgVar.cc();
        }
        if (askgVar.ip()) {
            return askgVar.cZ();
        }
        if (askgVar.im()) {
            return askgVar.cW();
        }
        if (askgVar.in()) {
            return askgVar.cX();
        }
        if (askgVar.io()) {
            return askgVar.cY();
        }
        if (askgVar.iT()) {
            return askgVar.dD();
        }
        if (askgVar.fW()) {
            return askgVar.aL();
        }
        if (askgVar.hp()) {
            return askgVar.ca();
        }
        if (askgVar.gC()) {
            return askgVar.br();
        }
        if (askgVar.gD()) {
            return askgVar.bs();
        }
        if (askgVar.gE()) {
            return askgVar.bt();
        }
        if (askgVar.fk()) {
            return askgVar.Y();
        }
        if (askgVar.gc()) {
            return askgVar.aR();
        }
        if (askgVar.gM()) {
            return askgVar.bB();
        }
        if (askgVar.eq()) {
            return askgVar.c();
        }
        if (askgVar.er()) {
            return askgVar.d();
        }
        if (askgVar.es()) {
            return askgVar.e();
        }
        if (askgVar.et()) {
            return askgVar.f();
        }
        if (askgVar.ev()) {
            return askgVar.h();
        }
        if (askgVar.eu()) {
            return askgVar.g();
        }
        if (askgVar.ew()) {
            return askgVar.i();
        }
        if (askgVar.iK()) {
            return askgVar.dv();
        }
        if (askgVar.iM()) {
            return askgVar.dx();
        }
        if (askgVar.il()) {
            return askgVar.cV();
        }
        if (askgVar.eM()) {
            return askgVar.x();
        }
        if (askgVar.eN()) {
            return askgVar.y();
        }
        if (askgVar.hC()) {
            return askgVar.cm();
        }
        if (askgVar.gF()) {
            return askgVar.bu();
        }
        if (askgVar.gG()) {
            return askgVar.bv();
        }
        if (askgVar.ja()) {
            return askgVar.dK();
        }
        if (askgVar.hk()) {
            return askgVar.bY();
        }
        if (askgVar.iY()) {
            return askgVar.dI();
        }
        if (askgVar.gg()) {
            return askgVar.aV();
        }
        if (askgVar.gh()) {
            return askgVar.aW();
        }
        if (askgVar.ez()) {
            return askgVar.l();
        }
        if (askgVar.ju()) {
            return askgVar.ed();
        }
        if (askgVar.gP()) {
            return askgVar.bE();
        }
        if (askgVar.hB()) {
            return askgVar.cl();
        }
        if (askgVar.eE()) {
            return askgVar.p();
        }
        if (askgVar.gH()) {
            return askgVar.bw();
        }
        if (askgVar.gI()) {
            return askgVar.bx();
        }
        if (askgVar.gJ()) {
            return askgVar.by();
        }
        if (askgVar.iW()) {
            return askgVar.dG();
        }
        if (askgVar.iu()) {
            return askgVar.df();
        }
        if (askgVar.fL()) {
            return askgVar.de();
        }
        if (askgVar.hq()) {
            return askgVar.cb();
        }
        if (askgVar.iV()) {
            return askgVar.dF();
        }
        if (askgVar.iC()) {
            return askgVar.dn();
        }
        if (askgVar.iE()) {
            return askgVar.dp();
        }
        if (askgVar.iI()) {
            return askgVar.dt();
        }
        if (askgVar.iB()) {
            return askgVar.dm();
        }
        if (askgVar.iF()) {
            return askgVar.dq();
        }
        if (askgVar.iH()) {
            return askgVar.ds();
        }
        if (askgVar.iG()) {
            return askgVar.dr();
        }
        if (askgVar.iD()) {
            return askgVar.m32do();
        }
        if (askgVar.eO()) {
            return askgVar.z();
        }
        if (askgVar.ho()) {
            return askgVar.bZ();
        }
        if (askgVar.eA()) {
            return askgVar.m();
        }
        if (askgVar.eB()) {
            return askgVar.n();
        }
        if (askgVar.gb()) {
            return askgVar.aQ();
        }
        if (askgVar.fy()) {
            return askgVar.am();
        }
        if (askgVar.fU()) {
            return askgVar.aJ();
        }
        if (askgVar.eS()) {
            return askgVar.D();
        }
        if (askgVar.jx()) {
            return askgVar.ej();
        }
        if (askgVar.fl()) {
            return askgVar.Z();
        }
        if (askgVar.fm()) {
            return askgVar.aa();
        }
        if (askgVar.eR()) {
            return askgVar.C();
        }
        if (askgVar.hl()) {
            return askgVar.E();
        }
        if (askgVar.hm()) {
            return askgVar.F();
        }
        if (askgVar.hn()) {
            return askgVar.G();
        }
        if (askgVar.jy()) {
            return askgVar.ek();
        }
        if (askgVar.jz()) {
            return askgVar.el();
        }
        if (askgVar.iA()) {
            return askgVar.dl();
        }
        if (askgVar.fw()) {
            return askgVar.ak();
        }
        if (askgVar.fv()) {
            return askgVar.aj();
        }
        if (askgVar.gs()) {
            return askgVar.bh();
        }
        if (askgVar.fK()) {
            return askgVar.ay();
        }
        if (askgVar.ht()) {
            return askgVar.cd();
        }
        if (askgVar.ey()) {
            return askgVar.k();
        }
        if (askgVar.fT()) {
            return askgVar.aI();
        }
        if (askgVar.eT()) {
            return askgVar.H();
        }
        if (askgVar.ep()) {
            return askgVar.b();
        }
        if (askgVar.iU()) {
            return askgVar.dE();
        }
        if (askgVar.gK()) {
            return askgVar.bz();
        }
        if (askgVar.hA()) {
            return askgVar.ck();
        }
        if (askgVar.gx()) {
            return askgVar.bm();
        }
        if (askgVar.gy()) {
            return askgVar.bn();
        }
        if (askgVar.fO()) {
            return askgVar.aD();
        }
        if (askgVar.gr()) {
            return askgVar.bg();
        }
        if (askgVar.eo()) {
            return askgVar.a();
        }
        if (askgVar.hd()) {
            return askgVar.bS();
        }
        if (askgVar.fj()) {
            return askgVar.X();
        }
        if (askgVar.iJ()) {
            return askgVar.du();
        }
        if (askgVar.fS()) {
            return askgVar.aH();
        }
        if (askgVar.fn()) {
            return askgVar.ab();
        }
        if (askgVar.hD()) {
            return askgVar.cn();
        }
        if (askgVar.fg()) {
            return askgVar.U();
        }
        if (askgVar.eD()) {
            return askgVar.o();
        }
        if (askgVar.gQ()) {
            return askgVar.bF();
        }
        if (askgVar.eQ()) {
            return askgVar.B();
        }
        if (askgVar.gv()) {
            return askgVar.bk();
        }
        if (askgVar.fY()) {
            return askgVar.aN();
        }
        return null;
    }

    public static aooy aa(askb askbVar) {
        if (askbVar == null) {
            return null;
        }
        int i = askbVar.b;
        if ((i & 1) != 0) {
            aska askaVar = askbVar.c;
            return askaVar == null ? aska.a : askaVar;
        }
        if ((i & 2) != 0) {
            askc askcVar = askbVar.d;
            return askcVar == null ? askc.a : askcVar;
        }
        if ((i & 4) != 0) {
            apzy apzyVar = askbVar.e;
            return apzyVar == null ? apzy.a : apzyVar;
        }
        if ((i & 8) != 0) {
            aski askiVar = askbVar.f;
            return askiVar == null ? aski.a : askiVar;
        }
        if ((i & 16) != 0) {
            askh askhVar = askbVar.g;
            return askhVar == null ? askh.a : askhVar;
        }
        if ((i & 32) != 0) {
            auwf auwfVar = askbVar.h;
            return auwfVar == null ? auwf.a : auwfVar;
        }
        if ((i & 64) != 0) {
            aqrf aqrfVar = askbVar.i;
            return aqrfVar == null ? aqrf.a : aqrfVar;
        }
        if ((i & 128) != 0) {
            aulg aulgVar = askbVar.j;
            return aulgVar == null ? aulg.a : aulgVar;
        }
        if ((i & 256) == 0) {
            return null;
        }
        aptj aptjVar = askbVar.k;
        return aptjVar == null ? aptj.a : aptjVar;
    }

    public static aooy ab(apok apokVar) {
        if (apokVar == null) {
            return null;
        }
        int i = apokVar.b;
        if (i == 144881215) {
            return (aqjc) apokVar.c;
        }
        if (i == 86135402) {
            return (asjh) apokVar.c;
        }
        return null;
    }

    public static boolean ac(afsx afsxVar, afsx afsxVar2) {
        return afsxVar2.b().equals(afsxVar.b()) && afsxVar2.d().equals(afsxVar.d());
    }

    public static void ad(aalc aalcVar, Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            aakt aaktVar = (aakt) it.next();
            if (aaktVar != null) {
                aalcVar.d(aaktVar);
            }
        }
    }

    public static void ae(aalc aalcVar, aakt aaktVar) {
        aaktVar.getClass();
        aalcVar.a(aaktVar.d());
    }

    public static void af(vin vinVar, String str) {
        for (int i = 0; i < str.length(); i++) {
            Character valueOf = Character.valueOf(str.charAt(i));
            char charValue = valueOf.charValue();
            if (charValue == '_') {
                vinVar.b("_");
            } else {
                switch (charValue) {
                    case '0':
                        vinVar.b("0");
                        break;
                    case '1':
                        vinVar.b("1");
                        break;
                    case '2':
                        vinVar.b("2");
                        break;
                    case '3':
                        vinVar.b("3");
                        break;
                    case '4':
                        vinVar.b("4");
                        break;
                    case '5':
                        vinVar.b("5");
                        break;
                    case '6':
                        vinVar.b("6");
                        break;
                    case '7':
                        vinVar.b("7");
                        break;
                    case '8':
                        vinVar.b("8");
                        break;
                    case '9':
                        vinVar.b("9");
                        break;
                    default:
                        switch (charValue) {
                            case 'A':
                                vinVar.b("A");
                                break;
                            case 'B':
                                vinVar.b("B");
                                break;
                            case 'C':
                                vinVar.b("C");
                                break;
                            case 'D':
                                vinVar.b("D");
                                break;
                            case 'E':
                                vinVar.b("E");
                                break;
                            case 'F':
                                vinVar.b("F");
                                break;
                            case 'G':
                                vinVar.b("G");
                                break;
                            case 'H':
                                vinVar.b("H");
                                break;
                            case 'I':
                                vinVar.b("I");
                                break;
                            case 'J':
                                vinVar.b("J");
                                break;
                            case 'K':
                                vinVar.b("K");
                                break;
                            case 'L':
                                vinVar.b("L");
                                break;
                            case 'M':
                                vinVar.b("M");
                                break;
                            case 'N':
                                vinVar.b("N");
                                break;
                            case 'O':
                                vinVar.b("O");
                                break;
                            case 'P':
                                vinVar.b("P");
                                break;
                            case 'Q':
                                vinVar.b("Q");
                                break;
                            case 'R':
                                vinVar.b("R");
                                break;
                            case 'S':
                                vinVar.b("S");
                                break;
                            case 'T':
                                vinVar.b("T");
                                break;
                            case 'U':
                                vinVar.b("U");
                                break;
                            case 'V':
                                vinVar.b("V");
                                break;
                            case 'W':
                                vinVar.b("W");
                                break;
                            case 'X':
                                vinVar.b("X");
                                break;
                            case 'Y':
                                vinVar.b("Y");
                                break;
                            case 'Z':
                                vinVar.b("Z");
                                break;
                            default:
                                switch (charValue) {
                                    case 'a':
                                        vinVar.b("a");
                                        break;
                                    case 'b':
                                        vinVar.b("b");
                                        break;
                                    case 'c':
                                        vinVar.b("c");
                                        break;
                                    case 'd':
                                        vinVar.b("d");
                                        break;
                                    case 'e':
                                        vinVar.b("e");
                                        break;
                                    case 'f':
                                        vinVar.b("f");
                                        break;
                                    case 'g':
                                        vinVar.b("g");
                                        break;
                                    case 'h':
                                        vinVar.b("h");
                                        break;
                                    case 'i':
                                        vinVar.b("i");
                                        break;
                                    case 'j':
                                        vinVar.b("j");
                                        break;
                                    case 'k':
                                        vinVar.b("k");
                                        break;
                                    case 'l':
                                        vinVar.b("l");
                                        break;
                                    case 'm':
                                        vinVar.b("m");
                                        break;
                                    case 'n':
                                        vinVar.b("n");
                                        break;
                                    case 'o':
                                        vinVar.b("o");
                                        break;
                                    case 'p':
                                        vinVar.b("p");
                                        break;
                                    case 'q':
                                        vinVar.b("q");
                                        break;
                                    case 'r':
                                        vinVar.b("r");
                                        break;
                                    case 's':
                                        vinVar.b("s");
                                        break;
                                    case 't':
                                        vinVar.b("t");
                                        break;
                                    case 'u':
                                        vinVar.b("u");
                                        break;
                                    case 'v':
                                        vinVar.b("v");
                                        break;
                                    case 'w':
                                        vinVar.b("w");
                                        break;
                                    case 'x':
                                        vinVar.b("x");
                                        break;
                                    case 'y':
                                        vinVar.b("y");
                                        break;
                                    case 'z':
                                        vinVar.b("z");
                                        break;
                                    default:
                                        String valueOf2 = String.valueOf(valueOf);
                                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 26);
                                        sb.append("Unhandled table name char:");
                                        sb.append(valueOf2);
                                        throw new IllegalStateException(sb.toString());
                                }
                        }
                }
            }
        }
    }

    public static void ag(viq viqVar, aakt aaktVar) {
        amxd listIterator = aaktVar.a().listIterator();
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("parent_entity_key", aaktVar.d());
            contentValues.put("child_entity_key", str);
            viqVar.f("entity_associations", contentValues);
        }
    }

    private static wzc b(apck apckVar, boolean z, boolean z2, int i, Context context, String str, String str2, String str3, wyx wyxVar) {
        return new wzc(context, str, apckVar, str2, str3, wyxVar, z, z2, i);
    }

    private static wzf c(apck apckVar, boolean z, boolean z2, long j, int i, Context context, String str, String str2, String str3, wyx wyxVar, shf shfVar, afsy afsyVar) {
        return new wzf(context, str, apckVar, str2, str3, wyxVar, shfVar, j, afsyVar, z, z2, i);
    }

    public static boolean e(aadw aadwVar) {
        aouw aouwVar = aadwVar.b().j;
        if (aouwVar == null) {
            aouwVar = aouw.a;
        }
        return aouwVar.b;
    }

    public static apxf f(apxf apxfVar) {
        if (apxfVar == null) {
            return null;
        }
        aong aongVar = (aong) apxfVar.toBuilder();
        aongVar.copyOnWrite();
        apxf apxfVar2 = (apxf) aongVar.instance;
        apxfVar2.b &= -2;
        apxfVar2.c = apxf.a.c;
        aongVar.copyOnWrite();
        ((apxf) aongVar.instance).d = apxf.emptyProtobufList();
        aongVar.d(aupg.b);
        aone createBuilder = atmc.a.createBuilder();
        createBuilder.copyOnWrite();
        atmc atmcVar = (atmc) createBuilder.instance;
        atmcVar.b |= 512;
        atmcVar.g = true;
        aongVar.e(atmb.b, (atmc) createBuilder.build());
        return (apxf) aongVar.build();
    }

    public static apxf g(apxf apxfVar) {
        apxf apxfVar2 = null;
        auuo auuoVar = apxfVar == null ? null : (auuo) apxfVar.pX(SignInEndpointOuterClass.signInEndpoint);
        if (auuoVar != null && (auuoVar.b & 2) != 0 && (apxfVar2 = auuoVar.c) == null) {
            apxfVar2 = apxf.a;
        }
        apxf f = f(apxfVar2);
        if (auuoVar == null || f == null) {
            return apxfVar;
        }
        aone createBuilder = auuo.a.createBuilder(auuoVar);
        createBuilder.copyOnWrite();
        auuo auuoVar2 = (auuo) createBuilder.instance;
        auuoVar2.c = f;
        auuoVar2.b |= 2;
        auuo auuoVar3 = (auuo) createBuilder.build();
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(SignInEndpointOuterClass.signInEndpoint, auuoVar3);
        return (apxf) aongVar.build();
    }

    public static alym h(afsx afsxVar) {
        aong aongVar = (aong) alym.a.createBuilder();
        String i = i(afsxVar);
        aongVar.copyOnWrite();
        alym alymVar = (alym) aongVar.instance;
        alymVar.b |= 256;
        alymVar.i = i;
        String j = j(afsxVar);
        aongVar.copyOnWrite();
        alym alymVar2 = (alym) aongVar.instance;
        alymVar2.b |= 1;
        alymVar2.c = j;
        return (alym) aongVar.build();
    }

    public static String i(afsx afsxVar) {
        return afsxVar.y() ? "pseudonymous" : afsxVar.x() ? "youtube-delegated" : afsxVar.g() ? "youtube-incognito" : "youtube-direct";
    }

    public static String j(afsx afsxVar) {
        return afsxVar.b().equals("") ? "pseudonymous" : afsxVar.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (r0 == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        if (r2 == 0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.wza k(android.content.Context r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, defpackage.wyx r20, defpackage.shf r21, defpackage.afsy r22, defpackage.aadw r23) {
        /*
            r0 = 0
            if (r23 == 0) goto L12
            apck r1 = r23.a()
            apck r2 = defpackage.apck.a
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L10
            goto L12
        L10:
            r3 = r1
            goto L13
        L12:
            r3 = r0
        L13:
            r0 = 0
            r1 = 1
            if (r3 == 0) goto L1e
            int r2 = r3.b
            r2 = r2 & r1
            if (r2 == 0) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            if (r3 == 0) goto L28
            boolean r4 = r3.e
            if (r4 == 0) goto L26
            goto L28
        L26:
            r4 = 0
            goto L29
        L28:
            r4 = 1
        L29:
            if (r3 == 0) goto L31
            boolean r5 = r3.f
            if (r5 == 0) goto L31
            r5 = 1
            goto L32
        L31:
            r5 = 0
        L32:
            if (r3 == 0) goto L42
            apcl r0 = r3.j
            if (r0 != 0) goto L3a
            apcl r0 = defpackage.apcl.a
        L3a:
            int r0 = r0.b
            int r0 = defpackage.amkq.bP(r0)
            if (r0 != 0) goto L43
        L42:
            r0 = 1
        L43:
            if (r21 != 0) goto L55
            r6 = r0
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            wzc r0 = b(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L55:
            if (r2 == 0) goto L65
            apcj r2 = r3.c
            if (r2 != 0) goto L5d
            apcj r2 = defpackage.apcj.a
        L5d:
            int r2 = r2.b
            int r2 = defpackage.amkq.bQ(r2)
            if (r2 != 0) goto L66
        L65:
            r2 = 1
        L66:
            int r2 = r2 + (-1)
            if (r2 == r1) goto L99
            r1 = 2
            if (r2 == r1) goto L83
            long r6 = defpackage.wyz.a
            r8 = r0
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = r19
            r13 = r20
            r14 = r21
            r15 = r22
            wzf r0 = c(r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        L83:
            long r6 = r3.d
            r8 = r0
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = r19
            r13 = r20
            r14 = r21
            r15 = r22
            wzf r0 = c(r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        L99:
            r6 = r0
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            wzc r0 = b(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whu.k(android.content.Context, java.lang.String, java.lang.String, java.lang.String, wyx, shf, afsy, aadw):wza");
    }

    public static void l(xgh xghVar, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "[Control flow] ".concat(valueOf);
        }
        if (xghVar == null) {
            String valueOf2 = String.valueOf(str);
            afsi.b(2, 1, valueOf2.length() != 0 ? "[Control flow] ".concat(valueOf2) : new String("[Control flow] "));
            return;
        }
        String f = whl.f(xghVar);
        StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 17 + String.valueOf(str).length());
        sb.append("[Control flow] ");
        sb.append(f);
        sb.append(": ");
        sb.append(str);
        afsi.b(2, 1, sb.toString());
    }

    public static void m(xgh xghVar, xev xevVar, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "[Control flow] ".concat(valueOf);
        }
        if (xghVar == null) {
            String valueOf2 = String.valueOf(str);
            afsi.b(2, 1, valueOf2.length() != 0 ? "[Control flow] ".concat(valueOf2) : new String("[Control flow] "));
            return;
        }
        String f = whl.f(xghVar);
        StringBuilder sb = new StringBuilder(xevVar.b.name());
        sb.append(" ");
        whl.g(sb, xevVar.d);
        whl.g(sb, xevVar.e);
        whl.g(sb, xevVar.f);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(f).length() + 19 + String.valueOf(sb2).length() + String.valueOf(str).length());
        sb3.append("[Control flow] ");
        sb3.append(f);
        sb3.append(", ");
        sb3.append(sb2);
        sb3.append(": ");
        sb3.append(str);
        afsi.b(2, 1, sb3.toString());
    }

    public static void n(String str) {
        l(null, str);
    }

    public static zct o() {
        return new zct();
    }

    public static Animator.AnimatorListener p(zcf zcfVar) {
        return new zcj(zcfVar);
    }

    public static kb q(zcf zcfVar) {
        return new zci(zcfVar);
    }

    public static void r(View view, Drawable drawable) {
        view.getClass();
        int i = jw.i(view);
        int paddingTop = view.getPaddingTop();
        int h = jw.h(view);
        int paddingBottom = view.getPaddingBottom();
        view.setBackground(drawable);
        jw.Y(view, i, paddingTop, h, paddingBottom);
    }

    public static void s(View view, Drawable drawable) {
        view.getClass();
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        int i = jw.i(view);
        int paddingTop = view.getPaddingTop();
        int h = jw.h(view);
        int paddingBottom = view.getPaddingBottom();
        view.setForeground(drawable);
        jw.Y(view, i, paddingTop, h, paddingBottom);
    }

    public static float t(Context context, float f, float f2) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float J2 = yjk.J(displayMetrics, f2);
        float ceil = ((float) Math.ceil(yjk.J(displayMetrics, f) / J2)) * J2;
        if (ceil > yjk.M(context)) {
            ceil -= J2;
        }
        double d = ceil;
        double d2 = J2;
        Double.isNaN(d2);
        if (d < d2 * 1.5d) {
            ceil = J2 * 1.5f;
        }
        return yjk.I(displayMetrics, ceil);
    }

    public static float u(Resources resources, int i) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        return typedValue.getFloat();
    }

    public static int v(Context context, ListAdapter listAdapter, ViewGroup viewGroup) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(yjk.N(context), CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        int i = 0;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        while (i < count) {
            int itemViewType = listAdapter.getItemViewType(i);
            int i4 = itemViewType != i3 ? itemViewType : i3;
            if (itemViewType != i3) {
                view = null;
            }
            view = listAdapter.getView(i, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
            i++;
            i3 = i4;
        }
        return i2;
    }

    public static Bitmap w(Bitmap bitmap, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        float f = i;
        int width = bitmap.getWidth();
        float f2 = i2;
        int height = bitmap.getHeight();
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(f / width, f2 / height, f3, f4);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setMatrix(matrix);
        int width2 = bitmap.getWidth();
        canvas.drawBitmap(bitmap, f3 - (width2 / 2), f4 - (bitmap.getHeight() / 2), new Paint(2));
        return createBitmap;
    }

    public static Drawable x(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i == 1 ? new int[]{R.attr.selectableItemBackgroundBorderless} : new int[]{R.attr.selectableItemBackground});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public static Drawable y(Context context, int i, int i2) {
        Drawable a = aii.a(context, i);
        a.mutate().setColorFilter(wbs.Q(context, i2), PorterDuff.Mode.SRC_IN);
        return a;
    }

    public static View z(View view, int i, int i2) {
        View findViewById = view.findViewById(i);
        if (findViewById == null || !(findViewById instanceof ViewStub)) {
            return view.findViewById(i2);
        }
        return ((ViewStub) findViewById).inflate();
    }

    public /* bridge */ /* synthetic */ aakt a(aakv aakvVar) {
        throw null;
    }
}
