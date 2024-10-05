package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_ColorConstantActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_ColorIntActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_ThemedActionBarColor;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gfw {
    public static void A(String str, Context context, zry zryVar) {
        zrx r = zryVar.r();
        if (r == null) {
            return;
        }
        File file = new File(new File(context.getCacheDir(), "reel_effects"), str);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                zga.b(e.getMessage());
            }
        }
        r.h(file.getPath());
    }

    public static void C(Drawable drawable, int i) {
        ((TransitionDrawable) drawable).reverseTransition(i);
    }

    public static void D(Drawable drawable) {
        ((TransitionDrawable) drawable).startTransition(200);
    }

    public static lkb E() {
        return new lkb(gik.class, null, null);
    }

    public static final void a() {
    }

    public static final void b() {
    }

    public static final void c() {
    }

    public static View d(Context context, ViewGroup viewGroup, boolean z) {
        return LayoutInflater.from(context).inflate(true != z ? R.layout.hats_horizontal_survey_option : R.layout.hats_vertical_survey_option, viewGroup, false);
    }

    public static CharSequence e(List list) {
        Spanned spanned;
        avch avchVar;
        int size = list.size();
        do {
            size--;
            spanned = null;
            aqyg aqygVar = null;
            if (size < 0) {
                break;
            }
            avcj avcjVar = (avcj) list.get(size);
            if (avcjVar.b == 84469192) {
                avchVar = (avch) avcjVar.c;
            } else {
                avchVar = avch.a;
            }
            if ((avchVar.b & 2) != 0 && (aqygVar = avchVar.d) == null) {
                aqygVar = aqyg.a;
            }
            spanned = ajcq.b(aqygVar);
        } while (TextUtils.isEmpty(spanned));
        return spanned;
    }

    public static CharSequence f(List list) {
        avch avchVar;
        Spanned b;
        Iterator it = list.iterator();
        do {
            aqyg aqygVar = null;
            if (!it.hasNext()) {
                return null;
            }
            avcj avcjVar = (avcj) it.next();
            if (avcjVar.b == 84469192) {
                avchVar = (avch) avcjVar.c;
            } else {
                avchVar = avch.a;
            }
            if ((avchVar.b & 2) != 0 && (aqygVar = avchVar.d) == null) {
                aqygVar = aqyg.a;
            }
            b = ajcq.b(aqygVar);
        } while (TextUtils.isEmpty(b));
        return b;
    }

    public static void g(View view, avch avchVar, ajut ajutVar, View.OnClickListener onClickListener) {
        View findViewById = view.findViewById(R.id.hats_response_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.hats_response_icon);
        if (imageView == null) {
            return;
        }
        aqyg aqygVar = null;
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            if ((avchVar.b & 2) != 0 && (aqygVar = avchVar.d) == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar));
        } else {
            if ((avchVar.b & 2) != 0 && (aqygVar = avchVar.d) == null) {
                aqygVar = aqyg.a;
            }
            imageView.setContentDescription(ajcq.b(aqygVar));
        }
        if ((avchVar.b & 1) != 0) {
            arfs arfsVar = avchVar.c;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            imageView.setImageResource(ajutVar.a(b));
        }
        whu.I(imageView, 1 == (avchVar.b & 1));
        view.setOnClickListener(onClickListener);
    }

    public static void h(Menu menu, MenuInflater menuInflater, zau zauVar, SparseArray sparseArray, int i) {
        Drawable icon;
        int size = sparseArray.size();
        if (size == 0) {
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.clear();
        for (int i2 = 0; i2 < size; i2++) {
            fze fzeVar = (fze) sparseArray.valueAt(i2);
            if (fzeVar == null || fzeVar.h() == 0) {
                if (fzeVar instanceof fzk) {
                    fzk fzkVar = (fzk) fzeVar;
                    menu.add(0, fzkVar.g(), fzkVar.n(), fzkVar.o());
                } else {
                    zga.l(String.format("Unhandled menu item %s", fzeVar));
                }
            } else {
                Integer valueOf = Integer.valueOf(fzeVar.h());
                if (!hashSet.contains(valueOf)) {
                    menuInflater.inflate(valueOf.intValue(), menu);
                    hashSet.add(valueOf);
                }
            }
        }
        for (int i3 = 0; i3 < menu.size(); i3++) {
            MenuItem item = menu.getItem(i3);
            fze fzeVar2 = (fze) sparseArray.get(item.getItemId());
            if (fzeVar2 != null) {
                fzeVar2.l(item);
                if (zauVar != null) {
                    fzd i4 = fzeVar2.i();
                    if (i4 != null) {
                        i4.a(zauVar, i);
                    } else if (fzeVar2.k() && (icon = item.getIcon()) != null) {
                        item.setIcon(zauVar.b(icon, i));
                    }
                }
            }
        }
    }

    public static ActionBarColor i(int i) {
        return new AutoValue_ActionBarColor_ColorConstantActionBarColor(i);
    }

    public static ActionBarColor j(int i) {
        return new AutoValue_ActionBarColor_ColorIntActionBarColor(i);
    }

    public static ActionBarColor k(int i) {
        return new AutoValue_ActionBarColor_ThemedActionBarColor(i);
    }

    public static ActionBarColor l() {
        return j(0);
    }

    public static String m(avgg avggVar) {
        if (avggVar == null) {
            return null;
        }
        aott aottVar = avggVar.d;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        aots aotsVar = aottVar.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        if ((aotsVar.b & 2) == 0) {
            return null;
        }
        aott aottVar2 = avggVar.d;
        if (aottVar2 == null) {
            aottVar2 = aott.a;
        }
        aots aotsVar2 = aottVar2.c;
        if (aotsVar2 == null) {
            aotsVar2 = aots.a;
        }
        return aotsVar2.c;
    }

    public static PlaybackStartDescriptor n(PlaybackStartDescriptor playbackStartDescriptor, int i) {
        apxf apxfVar = playbackStartDescriptor.b;
        if (apxfVar == null) {
            return playbackStartDescriptor;
        }
        aone r = r(apxfVar);
        r.copyOnWrite();
        atmc atmcVar = (atmc) r.instance;
        atmc atmcVar2 = atmc.a;
        atmcVar.b |= 2;
        atmcVar.d = i;
        aifz e = playbackStartDescriptor.e();
        aong aongVar = (aong) apxfVar.toBuilder();
        aongVar.e(atmb.b, (atmc) r.build());
        e.a = (apxf) aongVar.build();
        e.f = playbackStartDescriptor.s();
        e.e = playbackStartDescriptor.r();
        PlaybackStartDescriptor a = e.a();
        a.o(playbackStartDescriptor);
        return a;
    }

    public static aomf o(aulq aulqVar) {
        apmg apmgVar = (aulqVar == null || !aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) ? null : (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
        if (apmgVar == null || (apmgVar.b & 1048576) == 0) {
            return null;
        }
        return apmgVar.t;
    }

    public static atmc p(apxf apxfVar) {
        if (apxfVar != null && apxfVar.pY(atmb.b)) {
            return (atmc) apxfVar.pX(atmb.b);
        }
        return null;
    }

    public static aukf q(arsd arsdVar) {
        if ((arsdVar.b & 2) == 0) {
            return null;
        }
        aukg aukgVar = arsdVar.d;
        if (aukgVar == null) {
            aukgVar = aukg.a;
        }
        if ((aukgVar.b & 1) == 0) {
            return null;
        }
        aukg aukgVar2 = arsdVar.d;
        if (aukgVar2 == null) {
            aukgVar2 = aukg.a;
        }
        aukf aukfVar = aukgVar2.c;
        return aukfVar == null ? aukf.a : aukfVar;
    }

    public static aone r(apxf apxfVar) {
        if (!apxfVar.pY(atmb.b)) {
            return atmc.a.createBuilder();
        }
        return ((atmc) apxfVar.pX(atmb.b)).toBuilder();
    }

    public static final void s(Uri uri, MediaMetadataRetriever mediaMetadataRetriever, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            try {
                try {
                    mediaMetadataRetriever.setDataSource(openAssetFileDescriptor.getFileDescriptor());
                    try {
                        openAssetFileDescriptor.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                } catch (RuntimeException e) {
                    u(mediaMetadataRetriever);
                    throw new IOException(e);
                }
            } catch (Throwable th) {
                try {
                    openAssetFileDescriptor.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("openAssetFileDescriptor returned null for ");
        sb.append(valueOf);
        throw new IOException(sb.toString());
    }

    public static final Bitmap t(long j, MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            return mediaMetadataRetriever.getFrameAtTime(j);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final void u(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            mediaMetadataRetriever.release();
        } catch (RuntimeException unused) {
        }
    }

    public static final void v(int i, String str) {
        afsi.c(i, 24, str, new Exception());
    }

    public static Bitmap w(Bitmap bitmap) {
        if (bitmap == null) {
            bitmap = null;
        } else {
            double width = bitmap.getWidth();
            double height = bitmap.getHeight();
            Double.isNaN(width);
            Double.isNaN(height);
            double d = width / height;
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            if (Math.abs((-0.5625d) + d) >= 0.001d) {
                if (d > 0.5625d) {
                    double d2 = height2;
                    Double.isNaN(d2);
                    int max = Math.max((int) Math.round(d2 * 0.5625d), 2);
                    bitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - max) / 2, 0, max, height2);
                } else {
                    double d3 = width2;
                    Double.isNaN(d3);
                    int max2 = Math.max((int) Math.round(d3 / 0.5625d), 2);
                    bitmap = Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() - max2) / 2, width2, max2);
                }
            }
        }
        return (bitmap.getHeight() <= 1280 || bitmap.getWidth() <= 720) ? bitmap : Bitmap.createScaledBitmap(bitmap, 720, 1280, true);
    }

    public static AnimatorSet x(hxf hxfVar, boolean z, AnimatorSet animatorSet) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hxfVar);
        return y(arrayList, z, animatorSet, 250L);
    }

    public static AnimatorSet y(List list, boolean z, AnimatorSet animatorSet, long j) {
        amkq.F(true, "Animation duration must be at least 0.");
        if (animatorSet != null && (animatorSet.isStarted() || animatorSet.isRunning())) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hxf hxfVar = (hxf) it.next();
            View a = hxfVar.a();
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = true != z ? 0.0f : 1.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a, (Property<View, Float>) property, fArr);
            ofFloat.setDuration(j);
            ofFloat.addListener(new hxe(a, hxfVar, z));
            arrayList.add(ofFloat);
        }
        animatorSet2.playTogether(arrayList);
        animatorSet2.start();
        return animatorSet2;
    }

    public static void z(hxg hxgVar) {
        ArrayList<hxg> arrayList = new ArrayList();
        arrayList.add(hxgVar);
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        for (hxg hxgVar2 : arrayList) {
            View c = hxgVar2.c();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c, (Property<View, Float>) View.TRANSLATION_Y, hxgVar2.b(), hxgVar2.a());
            ofFloat.setDuration(250L);
            ofFloat.addListener(new hxd(c, hxgVar2));
            arrayList2.add(ofFloat);
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.start();
    }

    public static Object B(ce ceVar, Class cls) {
        if (ceVar == null) {
            throw new IllegalStateException(String.format("Could not find %s from a parent fragment.", cls.getCanonicalName()));
        }
        if (!cls.isInstance(ceVar)) {
            return B(ceVar.C, cls);
        }
        return cls.cast(ceVar);
    }
}
