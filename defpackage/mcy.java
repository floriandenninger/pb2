package defpackage;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.youtube.app.mdx.WatchOnTvMenuItem;
import com.google.android.libraries.backup.Backup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ChannelListSubMenuRendererOuterClass;
import com.google.protos.youtube.api.innertube.FeedFilterChipBarRendererOuterClass;
import com.google.protos.youtube.api.innertube.HideEnclosingActionOuterClass$HideEnclosingAction;
import com.google.protos.youtube.api.innertube.SettingRenderer;
import com.google.protos.youtube.api.innertube.YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mcy {

    @Backup
    public static final String FEED_FILTER_BAR_TUTORIAL_LAST_SHOWN_TIMESTAMP = "feed_filter_bar_tutorial_last_shown_timestamp";

    @Backup
    public static final String FEED_FILTER_BAR_TUTORIAL_SHOWN_COUNT = "feed_filter_bar_tutorial_shown_count";

    public static ammv A(Context context, asvx asvxVar, int i, int i2) {
        int M;
        asvw asvwVar = asvxVar.d;
        if (asvwVar == null) {
            asvwVar = asvw.a;
        }
        int cY = amkq.cY(asvxVar.c);
        if (cY != 0 && cY == 4) {
            float f = asvwVar.c;
            if (f > 0.0f && f < 1.0f) {
                asvw asvwVar2 = asvxVar.d;
                if (asvwVar2 == null) {
                    asvwVar2 = asvw.a;
                }
                if ((asvwVar2.b & 2) != 0) {
                    float f2 = asvwVar2.d;
                    if (f2 > 0.0f) {
                        M = (int) f2;
                        return ammv.j(Integer.valueOf(Math.min((int) (((yjk.K(r1, yjk.M(context)) - i) - i2) * asvwVar2.c), yjk.K(context.getResources().getDisplayMetrics(), M))));
                    }
                }
                M = yjk.M(context);
                return ammv.j(Integer.valueOf(Math.min((int) (((yjk.K(r1, yjk.M(context)) - i) - i2) * asvwVar2.c), yjk.K(context.getResources().getDisplayMetrics(), M))));
            }
        }
        return amlr.a;
    }

    public static final Class[] B(mhm mhmVar, Object obj, int i) {
        if (i == -1) {
            return new Class[]{izi.class};
        }
        if (i == 0) {
            mhmVar.n((izi) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public static int C(Context context) {
        if (yjk.aa(context)) {
            return context.getResources().getInteger(R.integer.horizontal_shelf_num_columns_linear_grid_feed_tablet_prominent);
        }
        return context.getResources().getInteger(R.integer.horizontal_shelf_num_columns);
    }

    public static boolean D(aamd aamdVar) {
        atlx atlxVar;
        atlx atlxVar2;
        if (aamdVar == null) {
            return false;
        }
        auov auovVar = aamdVar.a;
        if ((auovVar.c & 2) == 0) {
            return false;
        }
        auou auouVar = auovVar.g;
        if (auouVar == null) {
            auouVar = auou.a;
        }
        if (auouVar.b != 256220752) {
            return false;
        }
        auou auouVar2 = aamdVar.a.g;
        if (auouVar2 == null) {
            auouVar2 = auou.a;
        }
        if (auouVar2.b == 256220752) {
            atlxVar = (atlx) auouVar2.c;
        } else {
            atlxVar = atlx.a;
        }
        if ((atlxVar.b & 1) == 0) {
            return false;
        }
        auou auouVar3 = aamdVar.a.g;
        if (auouVar3 == null) {
            auouVar3 = auou.a;
        }
        if (auouVar3.b == 256220752) {
            atlxVar2 = (atlx) auouVar3.c;
        } else {
            atlxVar2 = atlx.a;
        }
        aulq aulqVar = atlxVar2.c;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        return aulqVar.pY(ChannelListSubMenuRendererOuterClass.channelListSubMenuRenderer);
    }

    public static gad E(Activity activity, onf onfVar, jcm jcmVar, fzj fzjVar, aadw aadwVar, azrw azrwVar, WatchOnTvMenuItem watchOnTvMenuItem, axzg axzgVar) {
        amsv i = amsx.i();
        i.c(jcmVar);
        i.c(fzjVar);
        i.c(watchOnTvMenuItem);
        i.c(onfVar.a());
        atej atejVar = aadwVar.b().k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        aqzo aqzoVar = atejVar.o;
        if (aqzoVar == null) {
            aqzoVar = aqzo.a;
        }
        if (aqzoVar.b) {
            i.c((fze) azrwVar.get());
        }
        fzf a = fzg.a();
        a.a = activity.getString(R.string.application_name);
        a.d(i.g());
        a.b(gfw.k(R.attr.ytIconActiveOther));
        fzg a2 = a.a();
        gac gacVar = new gac();
        gacVar.l(fzg.a().a());
        gacVar.c(false);
        gacVar.d(false);
        gacVar.f(false);
        gacVar.b(gfw.l());
        gacVar.k(gfw.l());
        gacVar.h(0);
        gacVar.g(gfw.l());
        gacVar.j(0);
        gacVar.i(gfw.l());
        gacVar.e(gfw.l());
        gacVar.f = false;
        gacVar.l(a2);
        gacVar.b(gfw.k(R.attr.ytBrandBackgroundSolid));
        gacVar.k(gfw.k(R.attr.ytStatusBarBackground));
        gacVar.h(true != ((Boolean) axzgVar.a.a.Y(axzb.s).B().aB()).booleanValue() ? R.style.ThemeOverlay_YouTube_ActionBar_Title_Main : R.style.ThemeOverlay_YouTube_ActionBar_Title_Main_V2);
        gacVar.g(gfw.k(R.attr.ytTextPrimary));
        gacVar.j(R.style.ThemeOverlay_YouTube_ActionBar_Subtitle_Main);
        gacVar.i(gfw.k(R.attr.ytTextSecondary));
        return gacVar.a();
    }

    public static final lho F(Context context) {
        return new lho(context);
    }

    public static final Animator G(View view, int i, int i2, long j) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setDuration(j);
        ofObject.addUpdateListener(new jmh(view, 2));
        return ofObject;
    }

    public static arev H(arev arevVar, int i) {
        aong aongVar = (aong) arev.a.createBuilder(arevVar);
        aongVar.copyOnWrite();
        arev arevVar2 = (arev) aongVar.instance;
        arevVar2.c = null;
        arevVar2.b &= -2;
        aongVar.e(arer.b, true);
        if (i != -1) {
            aongVar.e(arer.c, Integer.valueOf(i));
        }
        return (arev) aongVar.build();
    }

    public static String I(auoa auoaVar) {
        if ((auoaVar.b & 2) == 0) {
            return null;
        }
        aqyg aqygVar = auoaVar.d;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return ajcq.b(aqygVar).toString();
    }

    public static boolean J(arev arevVar) {
        return ((Boolean) arevVar.pX(arer.b)).booleanValue();
    }

    public static void K(Context context, ViewGroup viewGroup, ajut ajutVar, List list, boolean z) {
        atdu atduVar;
        apkf apkfVar;
        apkh apkhVar;
        viewGroup.removeAllViews();
        if (list == null) {
            return;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.watch_card_badge_margin_end);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            awci awciVar = (awci) it.next();
            View view = null;
            if (awciVar != null && awciVar.b == 91394106) {
                view = View.inflate(context, R.layout.standalone_ypc_badge, null);
                gag gagVar = new gag(view, true == z ? 2 : 1);
                if (awciVar.b == 91394106) {
                    apkhVar = (apkh) awciVar.c;
                } else {
                    apkhVar = apkh.a;
                }
                gagVar.a(apkhVar);
            } else if (awciVar == null || awciVar.b != 104364901) {
                if (awciVar != null && awciVar.b == 128361622) {
                    view = View.inflate(context, R.layout.metadata_badge, null);
                    gaf gafVar = new gaf(ajutVar, context, view);
                    if (awciVar.b == 128361622) {
                        atduVar = (atdu) awciVar.c;
                    } else {
                        atduVar = atdu.a;
                    }
                    gafVar.f(atduVar);
                }
            } else {
                if (z) {
                    view = View.inflate(context, R.layout.watch_card_standalone_red_badge, null);
                } else {
                    view = View.inflate(context, R.layout.standalone_red_badge, null);
                }
                view.setId(R.id.standalone_red_badge);
                lab labVar = new lab(ajutVar, context, view);
                if (awciVar.b == 104364901) {
                    apkfVar = (apkf) awciVar.c;
                } else {
                    apkfVar = apkf.a;
                }
                labVar.a(apkfVar);
            }
            if (view != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMarginEnd(dimensionPixelSize);
                viewGroup.addView(view, marginLayoutParams);
            }
        }
    }

    public static void L(lgk lgkVar, auxp auxpVar) {
        if (auxpVar == null) {
            return;
        }
        if (auxpVar.i()) {
            aA(lgkVar.j(), lgkVar.k(), auxpVar);
            az(lgkVar.g(), lgkVar.h(), auxpVar);
        } else {
            aA(lgkVar.g(), lgkVar.h(), auxpVar);
            az(lgkVar.j(), lgkVar.k(), auxpVar);
        }
        whu.G(lgkVar.i(), ajcq.b(auxpVar.m() ? auxpVar.d() : null));
        whu.G(lgkVar.f(), ajcq.b(auxpVar.j() ? auxpVar.a() : null));
    }

    public static boolean M(aadw aadwVar) {
        apwy b = aadwVar.b();
        if (b == null) {
            return false;
        }
        asvu asvuVar = b.e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.n.equals("rotating_strings");
    }

    public static avfs N(List list) {
        return (avfs) P(list, laf.a);
    }

    public static avft O(List list) {
        return (avft) P(list, laf.d);
    }

    public static Object P(List list, lag lagVar) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object a = next != null ? lagVar.a(next) : null;
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    public static Object Q(Object[] objArr, lag lagVar) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object a = obj != null ? lagVar.a(obj) : null;
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    public static kyr R(Object obj) {
        if (obj instanceof apmd) {
            return new kyp((apmd) obj);
        }
        if (obj instanceof atop) {
            return new kyq((atop) obj);
        }
        throw new IllegalArgumentException("BundleItemModel can only wrap BundleItemRenderer or OfflineBundleItemRenderer");
    }

    public static final kxx S(Context context) {
        return new kxx(context);
    }

    public static String T(avve avveVar) {
        aqyg aqygVar = avveVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return ((aqyi) aqygVar.c.get(0)).c;
    }

    public static float U(long j, long j2) {
        if (j == 0 || j2 == 0 || j2 > j || aC(j, j2, aB(j, j2))) {
            return 0.0f;
        }
        return (float) j2;
    }

    public static int V(long j, long j2) {
        int i = 0;
        if (j != 0 && j2 != 0) {
            if (j2 > j) {
                return 0;
            }
            i = aB(j, j2);
            if (i < 10) {
                return 10;
            }
            if (aC(j, j2, i)) {
                return 100;
            }
        }
        return i;
    }

    public static long W(ammv ammvVar, shf shfVar, aakv aakvVar) {
        awil awilVar;
        atre b;
        long j = 2147483647L;
        if (!ammvVar.h()) {
            return 2147483647L;
        }
        for (awiv awivVar : ((awiu) ammvVar.c()).getDownloads()) {
            if (awivVar.b == 1 && (awilVar = (awil) aakvVar.f((String) awivVar.c).g(awil.class).X()) != null && (b = awilVar.b()) != null) {
                atqq aa = aa(b);
                long aD = aa != null ? aD(aa, b.getLastUpdatedTimestampSeconds().longValue(), shfVar) : 0L;
                atqq aa2 = aa(b);
                if (aa2 != null) {
                    atpg atpgVar = aa2.l;
                    if (atpgVar == null) {
                        atpgVar = atpg.a;
                    }
                    int bW = anaf.bW(atpgVar.d);
                    if (bW != 0 && bW == 2 && aD != 0) {
                        j = Math.min(j, aD);
                    }
                }
            }
        }
        return j;
    }

    public static long X(agnu agnuVar, shf shfVar) {
        if (agnuVar != null) {
            return aD(agnuVar.b, TimeUnit.MILLISECONDS.toSeconds(agnuVar.d), shfVar);
        }
        return 0L;
    }

    public static apxf Y(agnv agnvVar, boolean z, float f, int i, String str) {
        if (z) {
            return aigp.f(agnvVar.m(), null, 0, 0.0f);
        }
        return aify.g(agnvVar.m(), str, i, f);
    }

    public static atdn Z(Resources resources, aqyg aqygVar) {
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(HideEnclosingActionOuterClass$HideEnclosingAction.hideEnclosingAction, HideEnclosingActionOuterClass$HideEnclosingAction.a);
        apxf apxfVar = (apxf) aongVar.build();
        CharSequence text = resources.getText(R.string.dismiss);
        aone createBuilder = apmh.a.createBuilder();
        aong aongVar2 = (aong) apmg.a.createBuilder();
        aone createBuilder2 = avfc.a.createBuilder();
        avez avezVar = avez.THEME_ATTRIBUTE_TEXT1;
        createBuilder2.copyOnWrite();
        avfc avfcVar = (avfc) createBuilder2.instance;
        avfcVar.d = avezVar.aj;
        avfcVar.b |= 2;
        aongVar2.copyOnWrite();
        apmg apmgVar = (apmg) aongVar2.instance;
        avfc avfcVar2 = (avfc) createBuilder2.build();
        avfcVar2.getClass();
        apmgVar.d = avfcVar2;
        apmgVar.c = 20;
        aong aongVar3 = (aong) arfs.a.createBuilder();
        arfr arfrVar = arfr.CLOSE;
        aongVar3.copyOnWrite();
        arfs arfsVar = (arfs) aongVar3.instance;
        arfsVar.c = arfrVar.pV;
        arfsVar.b |= 1;
        aongVar2.copyOnWrite();
        apmg apmgVar2 = (apmg) aongVar2.instance;
        arfs arfsVar2 = (arfs) aongVar3.build();
        arfsVar2.getClass();
        apmgVar2.g = arfsVar2;
        apmgVar2.b |= 32;
        aongVar2.copyOnWrite();
        apmg apmgVar3 = (apmg) aongVar2.instance;
        apxfVar.getClass();
        apmgVar3.p = apxfVar;
        apmgVar3.b |= 32768;
        aone createBuilder3 = aott.a.createBuilder();
        aone createBuilder4 = aots.a.createBuilder();
        String charSequence = text.toString();
        createBuilder4.copyOnWrite();
        aots aotsVar = (aots) createBuilder4.instance;
        charSequence.getClass();
        aotsVar.b |= 2;
        aotsVar.c = charSequence;
        createBuilder3.copyOnWrite();
        aott aottVar = (aott) createBuilder3.instance;
        aots aotsVar2 = (aots) createBuilder4.build();
        aotsVar2.getClass();
        aottVar.c = aotsVar2;
        aottVar.b |= 1;
        aongVar2.copyOnWrite();
        apmg apmgVar4 = (apmg) aongVar2.instance;
        aott aottVar2 = (aott) createBuilder3.build();
        aottVar2.getClass();
        apmgVar4.s = aottVar2;
        apmgVar4.b |= 131072;
        createBuilder.copyOnWrite();
        apmh apmhVar = (apmh) createBuilder.instance;
        apmg apmgVar5 = (apmg) aongVar2.build();
        apmgVar5.getClass();
        apmhVar.c = apmgVar5;
        apmhVar.b |= 1;
        apmh apmhVar2 = (apmh) createBuilder.build();
        aone createBuilder5 = atdn.a.createBuilder();
        createBuilder5.copyOnWrite();
        atdn atdnVar = (atdn) createBuilder5.instance;
        atdnVar.e = aqygVar;
        atdnVar.b |= 1;
        aone createBuilder6 = atdo.a.createBuilder();
        createBuilder6.copyOnWrite();
        atdo atdoVar = (atdo) createBuilder6.instance;
        atdoVar.c = 4;
        atdoVar.b |= 1;
        createBuilder5.copyOnWrite();
        atdn atdnVar2 = (atdn) createBuilder5.instance;
        atdo atdoVar2 = (atdo) createBuilder6.build();
        atdoVar2.getClass();
        atdnVar2.g = atdoVar2;
        atdnVar2.b |= 16;
        createBuilder5.copyOnWrite();
        atdn atdnVar3 = (atdn) createBuilder5.instance;
        apmhVar2.getClass();
        atdnVar3.h = apmhVar2;
        atdnVar3.b |= 32;
        return (atdn) createBuilder5.build();
    }

    public static fzm a(mbn mbnVar, ajwi ajwiVar, Cfor cfor) {
        RecyclerView recyclerView = ajwiVar.K;
        fzm a = fzn.a();
        a.b = mbnVar.d();
        a.c(mbnVar.n());
        a.c = mbnVar;
        a.d = cfor;
        a.d(recyclerView);
        a.b(zev.e(recyclerView.getContext()));
        return a;
    }

    private static void aA(TextView textView, TextView textView2, auxp auxpVar) {
        Spanned b = ajcq.b(auxpVar.n() ? auxpVar.e() : null);
        Spanned b2 = ajcq.b(auxpVar.o() ? auxpVar.f() : null);
        textView.setText(b);
        textView.setContentDescription(ax(ay(auxpVar.e(), b), ay(auxpVar.f(), b2)));
        textView2.setText(b2);
    }

    private static int aB(long j, long j2) {
        return (int) ((((float) j2) / ((float) j)) * 100.0f);
    }

    private static boolean aC(long j, long j2, int i) {
        long j3 = j - j2;
        return j < 600 ? j3 < 60 && i >= 10 : j > 6000 ? j3 < 600 : i > 90;
    }

    private static long aD(atqq atqqVar, long j, shf shfVar) {
        atpg atpgVar = atqqVar.l;
        if (atpgVar == null) {
            atpgVar = atpg.a;
        }
        long j2 = atpgVar.c;
        if (j2 >= 0) {
            return Math.max((j + j2) - TimeUnit.MILLISECONDS.toSeconds(shfVar.c()), 0L);
        }
        return 0L;
    }

    public static atqq aa(atre atreVar) {
        try {
            return (atqq) aonm.parseFrom(atqq.a, atreVar.getOfflineStateBytes(), aomw.b());
        } catch (aoob e) {
            zga.d("Failed to get Offline State.", e);
            return null;
        }
    }

    public static String ac(Resources resources, shf shfVar, long j) {
        long c = shfVar.c() - j;
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(c);
        if (minutes < 60) {
            return minutes <= 0 ? resources.getString(R.string.last_update_recently) : resources.getQuantityString(R.plurals.last_update_in_minutes_message, minutes, Integer.valueOf(minutes));
        }
        int hours = (int) TimeUnit.MILLISECONDS.toHours(c);
        if (hours < 24) {
            return resources.getQuantityString(R.plurals.last_update_in_hours_message, hours, Integer.valueOf(hours));
        }
        int days = (int) TimeUnit.MILLISECONDS.toDays(c);
        if (days < 7) {
            return resources.getQuantityString(R.plurals.last_update_in_days_message, days, Integer.valueOf(days));
        }
        int i = days / 7;
        return resources.getQuantityString(R.plurals.last_update_in_weeks_message, i, Integer.valueOf(i));
    }

    public static String ad(Context context, agng agngVar) {
        agnb agnbVar = agngVar.c;
        boolean z = (agnbVar == null || agnbVar.e) ? false : true;
        int i = agngVar.f;
        if (agnbVar != null && z && i > 0) {
            Resources resources = context.getResources();
            int i2 = agngVar.f;
            return String.format("%s • %s", agnbVar.b, resources.getQuantityString(R.plurals.video_count, i2, Integer.valueOf(i2)));
        }
        if (agnbVar != null && z) {
            return agnbVar.b;
        }
        if (i <= 0) {
            return "";
        }
        Resources resources2 = context.getResources();
        int i3 = agngVar.f;
        return resources2.getQuantityString(R.plurals.video_count, i3, Integer.valueOf(i3));
    }

    public static String ae(Context context, long j, boolean z) {
        int x = fav.x(j);
        if (x <= 60) {
            if (x == 0) {
                if (z) {
                    return context.getResources().getString(R.string.download_video_unplayable_requires_premium);
                }
                x = 0;
            }
            if (z) {
                return context.getResources().getQuantityString(R.plurals.download_video_unplayable_future_minutes_plural, x, Integer.valueOf(x));
            }
            return context.getResources().getQuantityString(R.plurals.download_playlist_unplayable_future_minutes_plural, x, Integer.valueOf(x));
        }
        int w = fav.w(j);
        if (w <= 24) {
            if (z) {
                return context.getResources().getQuantityString(R.plurals.download_video_unplayable_future_hours_plural, w, Integer.valueOf(w));
            }
            return context.getResources().getQuantityString(R.plurals.download_playlist_unplayable_future_hours_plural, w, Integer.valueOf(w));
        }
        int v = fav.v(j);
        if (z) {
            return context.getResources().getQuantityString(R.plurals.download_video_unplayable_future_days_plural, v, Integer.valueOf(v));
        }
        return context.getResources().getQuantityString(R.plurals.download_playlist_unplayable_future_days_plural, v, Integer.valueOf(v));
    }

    public static void af(TextView textView, List list, agsw agswVar) {
        agnu agnuVar;
        int i = -1;
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            while (true) {
                if (i2 < list.size()) {
                    agnv e = agswVar.e(((agnp) list.get(i2)).f());
                    if (e != null && (agnuVar = e.j) != null) {
                        i = (int) TimeUnit.SECONDS.toDays(agnuVar.a());
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        if (i > 0) {
            textView.setText(textView.getResources().getQuantityString(R.plurals.offline_go_online_to_renew_dialog_message, i, Integer.valueOf(i)));
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    public static boolean ag(ammv ammvVar, aakv aakvVar) {
        awil awilVar;
        atre b;
        atqq aa;
        int bT;
        if (!ammvVar.h()) {
            return false;
        }
        for (awiv awivVar : ((awiu) ammvVar.c()).getDownloads()) {
            if (awivVar.b == 1 && (awilVar = (awil) aakvVar.f((String) awivVar.c).g(awil.class).X()) != null && (b = awilVar.b()) != null && (aa = aa(b)) != null && (bT = anaf.bT(aa.j)) != 0 && bT == 4) {
                return true;
            }
        }
        return false;
    }

    public static boolean ah(agnu agnuVar) {
        if (agnuVar == null) {
            return false;
        }
        atpg atpgVar = agnuVar.b.l;
        if (atpgVar == null) {
            atpgVar = atpg.a;
        }
        int bW = anaf.bW(atpgVar.d);
        return bW != 0 && bW == 2;
    }

    public static ammv ai(agnv agnvVar, boolean z, shf shfVar, float f, int i, String str) {
        agnu agnuVar = agnvVar.j;
        if (agnuVar != null) {
            atqq atqqVar = agnuVar.b;
            if (atqqVar.c == 15) {
                return aj((atpf) atqqVar.d);
            }
        }
        if (agnuVar != null && ah(agnuVar) && X(agnuVar, shfVar) == 0) {
            atpg atpgVar = agnuVar.b.l;
            if (atpgVar == null) {
                atpgVar = atpg.a;
            }
            if ((atpgVar.b & 4) != 0) {
                atpg atpgVar2 = agnuVar.b.l;
                if (atpgVar2 == null) {
                    atpgVar2 = atpg.a;
                }
                atpf atpfVar = atpgVar2.e;
                if (atpfVar == null) {
                    atpfVar = atpf.a;
                }
                return aj(atpfVar);
            }
        }
        return ammv.j(Y(agnvVar, z, f, i, str));
    }

    public static ammv ak(ajce ajceVar) {
        try {
            return ammv.j((aqnd) aonm.parseFrom(aqnd.a, Base64.decode(ajceVar.b(), 8), aomw.b()));
        } catch (aoob unused) {
            return amlr.a;
        }
    }

    public static aqnf al(ajce ajceVar) {
        return (aqnf) ap(ajceVar, jpt.q, aqnf.FILTER_TYPE_UNSPECIFIED);
    }

    public static aulm am(aqmy aqmyVar, aqnf aqnfVar, int i) {
        aone createBuilder = aqnd.a.createBuilder();
        aone createBuilder2 = aqmz.a.createBuilder();
        createBuilder2.copyOnWrite();
        aqmz aqmzVar = (aqmz) createBuilder2.instance;
        aqmzVar.c = aqmyVar.d;
        aqmzVar.b |= 1;
        createBuilder2.copyOnWrite();
        aqmz aqmzVar2 = (aqmz) createBuilder2.instance;
        aqmzVar2.d = aqnfVar.e;
        aqmzVar2.b |= 2;
        createBuilder2.copyOnWrite();
        aqmz aqmzVar3 = (aqmz) createBuilder2.instance;
        aqmzVar3.b |= 4;
        aqmzVar3.e = i;
        aqmz aqmzVar4 = (aqmz) createBuilder2.build();
        createBuilder.copyOnWrite();
        aqnd aqndVar = (aqnd) createBuilder.instance;
        aqmzVar4.getClass();
        aqndVar.c = aqmzVar4;
        aqndVar.b = 2;
        return ao((aqnd) createBuilder.build());
    }

    public static aulm an(aqnb aqnbVar) {
        aone createBuilder = aqnd.a.createBuilder();
        aone createBuilder2 = aqnc.a.createBuilder();
        createBuilder2.copyOnWrite();
        aqnc aqncVar = (aqnc) createBuilder2.instance;
        aqncVar.c = aqnbVar.c;
        aqncVar.b |= 1;
        aqnc aqncVar2 = (aqnc) createBuilder2.build();
        createBuilder.copyOnWrite();
        aqnd aqndVar = (aqnd) createBuilder.instance;
        aqncVar2.getClass();
        aqndVar.c = aqncVar2;
        aqndVar.b = 4;
        return ao((aqnd) createBuilder.build());
    }

    public static aulm ao(aqnd aqndVar) {
        aone createBuilder = aulm.a.createBuilder();
        String encodeToString = Base64.encodeToString(aqndVar.toByteArray(), 8);
        createBuilder.copyOnWrite();
        aulm aulmVar = (aulm) createBuilder.instance;
        encodeToString.getClass();
        aulmVar.c |= 1;
        aulmVar.d = encodeToString;
        return (aulm) createBuilder.build();
    }

    public static Object ap(ajce ajceVar, amml ammlVar, Object obj) {
        ammv ak = ak(ajceVar);
        return ak.h() ? ammlVar.apply((aqnd) ak.c()) : obj;
    }

    public static final kbu aq(int i, boolean z) {
        return new kbu(i, z);
    }

    public static lkb ar() {
        return new lkb(lcl.class);
    }

    public static lkb as() {
        return new lkb(lbz.class);
    }

    public static lkb at() {
        return new lkb(jyx.class);
    }

    public static boolean au(axzf axzfVar, agnu agnuVar) {
        return axzfVar.n() && ah(agnuVar);
    }

    private static String av(Context context, Date date) {
        return new SimpleDateFormat(true != DateFormat.is24HourFormat(context) ? "h:mm a" : "HH:mm", Locale.getDefault()).format(date);
    }

    private static Date aw(aqin aqinVar) {
        if (aqinVar == null) {
            return new Date(0, 0, 0, 0, 0);
        }
        return new Date(0, 0, 0, aqinVar.c, aqinVar.d);
    }

    private static CharSequence ax(CharSequence charSequence, CharSequence charSequence2) {
        return ammr.b(", ").c().e(fav.y(charSequence), fav.y(charSequence2), new Object[0]);
    }

    private static CharSequence ay(aqyg aqygVar, CharSequence charSequence) {
        CharSequence i = ajcq.i(aqygVar);
        return i != null ? i : charSequence;
    }

    private static void az(TextView textView, TextView textView2, auxp auxpVar) {
        Spanned b = ajcq.b(auxpVar.k() ? auxpVar.b() : null);
        Spanned b2 = ajcq.b(auxpVar.l() ? auxpVar.c() : null);
        textView.setText(b);
        textView.setContentDescription(ax(ay(auxpVar.b(), b), ay(auxpVar.c(), b2)));
        textView2.setText(b2);
    }

    public static void b(fzb fzbVar, final mbn mbnVar, ajwi ajwiVar, Cfor cfor, acra acraVar, String str) {
        if (!f(str)) {
            cfor.c.ax(new ayrs() { // from class: mcf
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    mbn mbnVar2 = mbn.this;
                    if (((foq) obj).a()) {
                        mbnVar2.k();
                    }
                }
            });
        }
        ajwiVar.y(new mch(mbnVar, ajwiVar, cfor, str, fzbVar, acraVar));
    }

    public static void c(boolean z, fzb fzbVar, fzn fznVar) {
        if (z) {
            fzbVar.m(fznVar);
        } else {
            fzbVar.i();
        }
    }

    public static boolean d(aamd aamdVar) {
        atlx atlxVar;
        atlx atlxVar2;
        auou auouVar = aamdVar.a.g;
        if (auouVar == null) {
            auouVar = auou.a;
        }
        if (auouVar.b != 256220752) {
            return false;
        }
        auou auouVar2 = aamdVar.a.g;
        if (auouVar2 == null) {
            auouVar2 = auou.a;
        }
        if (auouVar2.b == 256220752) {
            atlxVar = (atlx) auouVar2.c;
        } else {
            atlxVar = atlx.a;
        }
        if ((atlxVar.b & 2) == 0) {
            return false;
        }
        auou auouVar3 = aamdVar.a.g;
        if (auouVar3 == null) {
            auouVar3 = auou.a;
        }
        if (auouVar3.b == 256220752) {
            atlxVar2 = (atlx) auouVar3.c;
        } else {
            atlxVar2 = atlx.a;
        }
        aulq aulqVar = atlxVar2.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        return aulqVar.pY(FeedFilterChipBarRendererOuterClass.feedFilterChipBarRenderer);
    }

    public static boolean e(String str) {
        return "FEwhat_to_watch".equals(str);
    }

    public static boolean f(String str) {
        return "FEsubscriptions".equals(str);
    }

    public static CharSequence g(Context context, shf shfVar, avrx avrxVar) {
        if (avrxVar == null) {
            return "";
        }
        aqyg aqygVar = avrxVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar);
        return TextUtils.isEmpty(b) ? avrxVar.b * 1000 < shfVar.c() ? "" : context.getString(R.string.live_upcoming_scheduled_datetime, DateFormat.format(DateFormat.getBestDateTimePattern(Locale.getDefault(), "M d yy h mm a"), avrxVar.b * 1000)) : b;
    }

    public static final Class[] h(lyp lypVar, Object obj, int i) {
        if (i == -1) {
            return new Class[]{izi.class};
        }
        if (i == 0) {
            lypVar.b((izi) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public static zdj i(ywr ywrVar, avzr avzrVar) {
        return new zeg(ywrVar, new lre(avzrVar, 1), new lrf(avzrVar, 0));
    }

    public static zdj j(ywr ywrVar, avzr avzrVar) {
        return new zeg(ywrVar, new lre(avzrVar, 0), new lrf(avzrVar, 2));
    }

    public static int k(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (((auqb) list.get(i)).d) {
                return i;
            }
        }
        return 0;
    }

    public static TextView l(Context context, auqh auqhVar) {
        aqyg aqygVar;
        YouTubeTextView youTubeTextView = new YouTubeTextView(context);
        if ((auqhVar.b & 2) != 0) {
            aqygVar = auqhVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        youTubeTextView.setText(ajcq.b(aqygVar));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        youTubeTextView.setPadding(yjk.K(displayMetrics, 20), yjk.K(displayMetrics, 18), yjk.K(displayMetrics, 20), yjk.K(displayMetrics, 8));
        youTubeTextView.setTextSize(0, context.getResources().getDimension(R.dimen.extra_large_font_size));
        youTubeTextView.setTypeface(ajct.ROBOTO_MEDIUM.a(context));
        youTubeTextView.setTextColor(wbs.S(context, android.R.attr.textColorPrimary));
        return youTubeTextView;
    }

    public static String m(Context context, List list, int i) {
        aqin aqinVar = ((auqb) list.get(i)).c;
        if (aqinVar == null) {
            aqinVar = aqin.a;
        }
        return av(context, aw(aqinVar));
    }

    public static String n(Context context, List list) {
        for (int i = 0; i < list.size(); i++) {
            auqb auqbVar = (auqb) list.get(i);
            if (auqbVar.d) {
                aqin aqinVar = auqbVar.c;
                if (aqinVar == null) {
                    aqinVar = aqin.a;
                }
                return av(context, aw(aqinVar));
            }
        }
        aqin aqinVar2 = ((auqb) list.get(0)).c;
        if (aqinVar2 == null) {
            aqinVar2 = aqin.a;
        }
        return av(context, aw(aqinVar2));
    }

    public static List o(auqh auqhVar) {
        ArrayList arrayList = new ArrayList();
        for (auqd auqdVar : auqhVar.f) {
            if (auqdVar.b == 190692730) {
                arrayList.add((auqb) auqdVar.c);
            }
        }
        return arrayList;
    }

    public static List p(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqin aqinVar = ((auqb) it.next()).c;
            if (aqinVar == null) {
                aqinVar = aqin.a;
            }
            arrayList.add(av(context, aw(aqinVar)));
        }
        return arrayList;
    }

    public static List q(auqa auqaVar) {
        ArrayList arrayList = new ArrayList();
        for (aulq aulqVar : auqaVar.d) {
            if (aulqVar.pY(SettingRenderer.settingSingleOptionMenuRenderer)) {
                arrayList.add((auqh) aulqVar.pX(SettingRenderer.settingSingleOptionMenuRenderer));
            }
        }
        return arrayList;
    }

    public static List r(auqa auqaVar, int i) {
        List q = q(auqaVar);
        if (q.size() == 2) {
            return ((auqh) q.get(i)).f;
        }
        return new ArrayList();
    }

    public static auqa s(auqa auqaVar, int i, int i2) {
        auqb auqbVar;
        List q = q(auqaVar);
        if (q.size() != 2) {
            return auqaVar;
        }
        auqh auqhVar = (auqh) q.get(i);
        aony aonyVar = auqhVar.f;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < aonyVar.size()) {
            auqd auqdVar = (auqd) aonyVar.get(i3);
            aone builder = auqdVar.toBuilder();
            if (auqdVar.b == 190692730) {
                auqbVar = (auqb) auqdVar.c;
            } else {
                auqbVar = auqb.a;
            }
            aone builder2 = auqbVar.toBuilder();
            boolean z = i3 == i2 % aonyVar.size();
            builder2.copyOnWrite();
            auqb auqbVar2 = (auqb) builder2.instance;
            auqbVar2.b |= 4;
            auqbVar2.d = z;
            builder.copyOnWrite();
            auqd auqdVar2 = (auqd) builder.instance;
            auqb auqbVar3 = (auqb) builder2.build();
            auqbVar3.getClass();
            auqdVar2.c = auqbVar3;
            auqdVar2.b = 190692730;
            arrayList.add((auqd) builder.build());
            i3++;
        }
        aone builder3 = auqhVar.toBuilder();
        builder3.copyOnWrite();
        ((auqh) builder3.instance).f = auqh.emptyProtobufList();
        builder3.copyOnWrite();
        auqh auqhVar2 = (auqh) builder3.instance;
        auqhVar2.a();
        aolo.addAll((Iterable) arrayList, (List) auqhVar2.f);
        q.set(i, (auqh) builder3.build());
        aone builder4 = auqaVar.toBuilder();
        int i4 = 0;
        for (int i5 = 0; i5 < auqaVar.d.size() && i4 < q.size(); i5++) {
            if (((aulq) auqaVar.d.get(i5)).pY(SettingRenderer.settingSingleOptionMenuRenderer)) {
                aong aongVar = (aong) aulq.a.createBuilder();
                aongVar.e(SettingRenderer.settingSingleOptionMenuRenderer, (auqh) q.get(i4));
                builder4.copyOnWrite();
                auqa auqaVar2 = (auqa) builder4.instance;
                aulq aulqVar = (aulq) aongVar.build();
                aulqVar.getClass();
                auqaVar2.a();
                auqaVar2.d.set(i5, aulqVar);
                i4++;
            }
        }
        return (auqa) builder4.build();
    }

    public static void t(Handler handler, final Context context, final String str, final boolean z) {
        handler.post(new Runnable() { // from class: lny
            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(context, str, z ? 1 : 0).show();
            }
        });
    }

    public static void u(View view, int i) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 1.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setStartOffset((i * 75) + 1000);
        alphaAnimation.setRepeatCount(-1);
        alphaAnimation.setRepeatMode(2);
        view.setAnimation(alphaAnimation);
    }

    public static void v(View view) {
        Animation animation = view.getAnimation();
        if (animation != null) {
            animation.cancel();
            view.setAnimation(null);
        }
    }

    public static boolean w(aadw aadwVar) {
        String an = evr.an(aadwVar);
        return an != null && (an.equals("small_div_space") || an.equals("big_div_space"));
    }

    public static boolean x(aadw aadwVar) {
        String an = evr.an(aadwVar);
        return an != null && (an.equals("small_divider_exp") || an.equals("small_div_space"));
    }

    public static boolean y(aadw aadwVar) {
        String an = evr.an(aadwVar);
        return an != null && an.equals("small_div_space");
    }

    public static boolean z(aadw aadwVar) {
        String an = evr.an(aadwVar);
        if (an != null) {
            return an.equals("small_divider_exp") || an.equals("small_div_space") || an.equals("big_divider_exp") || an.equals("big_div_space");
        }
        return false;
    }

    public static String ab(Resources resources, int i, int i2) {
        if (i == i2 || i2 == 0) {
            return resources.getQuantityString(R.plurals.playlist_size_total, i, Integer.valueOf(i));
        }
        return resources.getString(R.string.playlist_size_total_and_downloaded, resources.getQuantityString(R.plurals.playlist_size_total, i, Integer.valueOf(i)), resources.getQuantityString(R.plurals.playlist_size_downloaded, i2, Integer.valueOf(i2)));
    }

    public static ammv aj(atpf atpfVar) {
        String str;
        if ((atpfVar.b & 4) == 0) {
            if (atpfVar.c != 2) {
                return amlr.a;
            }
            aone createBuilder = YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.a.createBuilder();
            str = atpfVar.c == 2 ? (String) atpfVar.d : "";
            createBuilder.copyOnWrite();
            YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint = (YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint) createBuilder.instance;
            str.getClass();
            ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.b = 1 | ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.b;
            ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.c = str;
            YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint2 = (YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint) createBuilder.build();
            aong aongVar = (aong) apxf.a.createBuilder();
            aongVar.e(YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.ypcGetOfflineUpsellEndpoint, ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint2);
            return ammv.j((apxf) aongVar.build());
        }
        aone createBuilder2 = aplt.a.createBuilder();
        String str2 = atpfVar.e;
        createBuilder2.copyOnWrite();
        aplt apltVar = (aplt) createBuilder2.instance;
        str2.getClass();
        apltVar.b |= 1;
        apltVar.c = str2;
        str = atpfVar.c == 1 ? (String) atpfVar.d : "";
        createBuilder2.copyOnWrite();
        aplt apltVar2 = (aplt) createBuilder2.instance;
        str.getClass();
        apltVar2.b |= 4;
        apltVar2.d = str;
        aplt apltVar3 = (aplt) createBuilder2.build();
        aong aongVar2 = (aong) apxf.a.createBuilder();
        aongVar2.e(BrowseEndpointOuterClass.browseEndpoint, apltVar3);
        return ammv.j((apxf) aongVar2.build());
    }
}
