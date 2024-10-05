package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata;
import com.google.android.libraries.backup.Backup;
import com.google.android.libraries.youtube.common.annotation.SubstringBackup;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand;
import com.google.protos.youtube.api.innertube.ShortsCreationEndpointOuterClass$ShortsCreationEndpoint;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fkc {

    @Backup
    public static final String OFFLINE_BUTTON_POOR_CONNECTIVITY_TOOLTIP_DISABLED = "offline_button_poor_connectivity_tooltip_disabled";

    @Backup
    public static final String OFFLINE_FIRST_ADD_TOOLTIP = "offline_first_add_tooltip";

    @Backup
    public static final String OFFLINE_LAST_CLIENT_VIDEO_PLAYBACK_POSITION_SYNC_TIME_MILLIS = "offline_last_client_video_playback_position_sync_time_millis";

    @Backup
    public static final String OFFLINE_LAST_SCHEDULED_AD_HOC_REFRESH_TIME_MILLIS = "offline_last_scheduled_ad_hoc_refresh_time_millis";

    @SubstringBackup
    public static final String OFFLINE_LAST_SCHEDULED_AD_HOC_REFRESH_TIME_MILLIS_FORMAT = "offline_last_scheduled_ad_hoc_refresh_time_millis_%d";

    @Backup
    public static final String OFFLINE_STREAM_SELECTION_DIALOG_REMEMBER_SETTING_CHECKED = "offline_stream_selection_dialog_remember_setting_checked";

    public static long A(axet axetVar) {
        axex axexVar = axetVar.d;
        if (axexVar == null) {
            axexVar = axex.a;
        }
        return axexVar.c;
    }

    public static autl B(apxf apxfVar) {
        if (apxfVar.pY(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)) {
            ShortsCreationEndpointOuterClass$ShortsCreationEndpoint shortsCreationEndpointOuterClass$ShortsCreationEndpoint = (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint) apxfVar.pX(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint);
            if ((shortsCreationEndpointOuterClass$ShortsCreationEndpoint.b & 2) != 0) {
                autl b = autl.b(shortsCreationEndpointOuterClass$ShortsCreationEndpoint.d);
                return b == null ? autl.SHORTS_CREATION_SURFACE_UNKNOWN : b;
            }
            afsi.b(1, 6, "[ShortsCreation][Android][ProjectState]No creation surface specified");
        } else {
            afsi.b(1, 6, "[ShortsCreation][Android][ProjectState]No shorts creation endpoint specified");
        }
        return autl.SHORTS_CREATION_SURFACE_UNKNOWN;
    }

    public static boolean C(apxf apxfVar) {
        return (apxfVar == null || !apxfVar.pY(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint) || ((ShortsCreationEndpointOuterClass$ShortsCreationEndpoint) apxfVar.pX(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)).c.isEmpty()) ? false : true;
    }

    public static boolean D(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static PlayerResponseModel a(ainy ainyVar) {
        aixh n;
        if (ainyVar.n() == null || (n = ainyVar.n()) == null) {
            return null;
        }
        return n.c();
    }

    public static atsb b(ainy ainyVar) {
        PlayerResponseModel a = a(ainyVar);
        if (a != null) {
            return ahbx.h(a.q());
        }
        return null;
    }

    public static final boolean c(ainy ainyVar) {
        return ainyVar.n() != null;
    }

    public static boolean d(fhg fhgVar) {
        return (!fhgVar.f() || fhgVar.d() || fhgVar.e()) ? false : true;
    }

    public static apxf e(PlaybackStartDescriptor playbackStartDescriptor) {
        aong aongVar;
        apxf apxfVar = playbackStartDescriptor.b;
        if (apxfVar != null) {
            return apxfVar;
        }
        if (playbackStartDescriptor.t()) {
            aongVar = (aong) aify.f(playbackStartDescriptor.l(), playbackStartDescriptor.k(), playbackStartDescriptor.a()).toBuilder();
        } else {
            aongVar = (aong) aigp.f(playbackStartDescriptor.l(), playbackStartDescriptor.k(), playbackStartDescriptor.a(), 0.0f).toBuilder();
        }
        aomf x = aomf.x(playbackStartDescriptor.y());
        aongVar.copyOnWrite();
        apxf apxfVar2 = (apxf) aongVar.instance;
        apxfVar2.b |= 1;
        apxfVar2.c = x;
        return (apxf) aongVar.build();
    }

    public static void f(ajjz ajjzVar, flx flxVar, ImageView imageView, String str, avgg avggVar, ajjv ajjvVar) {
        ajjzVar.getClass();
        flxVar.getClass();
        imageView.getClass();
        ajjzVar.e(imageView);
        if (str != null) {
            flv b = flxVar.b(str);
            Bitmap a = flxVar.a(str);
            if (a != null && !a.isRecycled()) {
                if (b != null) {
                    imageView.setScaleType(b.b);
                }
                imageView.setImageBitmap(a);
                return;
            }
        }
        if (avggVar != null) {
            if (ajjvVar == null) {
                ajjvVar = ajjv.a;
            }
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ajjzVar.k(imageView, avggVar, ajjvVar);
        }
    }

    public static boolean g(apxf apxfVar) {
        aifz d = PlaybackStartDescriptor.d();
        d.a = apxfVar;
        PlaybackStartDescriptor a = d.a();
        return ("".equals(a.l()) && "".equals(a.k())) ? false : true;
    }

    public static boolean h(RecyclerView recyclerView) {
        wd wdVar = recyclerView.n;
        if (wdVar != null && (wdVar instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) wdVar;
            int aq = linearLayoutManager.aq();
            if (linearLayoutManager.J() + aq >= linearLayoutManager.at()) {
                return true;
            }
        }
        return false;
    }

    public static avfx i(List list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            avfv avfvVar = (avfv) it.next();
            if ((avfvVar.b & 16384) != 0) {
                avfx avfxVar = avfvVar.k;
                return avfxVar == null ? avfx.a : avfxVar;
            }
        }
        return null;
    }

    public static void j(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            whu.G(textView, charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean k(android.widget.TextView r6, java.lang.CharSequence r7, java.lang.CharSequence r8, java.util.List r9, defpackage.avrx r10) {
        /*
            r0 = 0
            if (r9 == 0) goto L20
            java.util.Iterator r1 = r9.iterator()
        L7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            avfv r2 = (defpackage.avfv) r2
            int r3 = r2.b
            r3 = r3 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L7
            apjw r1 = r2.i
            if (r1 != 0) goto L21
            apjw r1 = defpackage.apjw.a
            goto L21
        L20:
            r1 = r0
        L21:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2f
            if (r1 != 0) goto L2d
            if (r10 == 0) goto L2f
        L2d:
            r10 = 1
            goto L30
        L2f:
            r10 = 0
        L30:
            if (r9 == 0) goto L4e
            java.util.Iterator r9 = r9.iterator()
        L36:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r9.next()
            avfv r2 = (defpackage.avfv) r2
            int r5 = r2.b
            r5 = r5 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L36
            apkb r0 = r2.j
            if (r0 != 0) goto L4e
            apkb r0 = defpackage.apkb.a
        L4e:
            if (r6 != 0) goto L57
            if (r10 != 0) goto L56
            if (r0 == 0) goto L55
            goto L56
        L55:
            return r4
        L56:
            return r3
        L57:
            j(r6, r7)
            r9 = 2130970683(0x7f04083b, float:1.7550083E38)
            if (r10 == 0) goto L83
            r7 = 2132018259(0x7f140453, float:1.967482E38)
            r6.setText(r7)
            r6.setVisibility(r4)
            android.content.Context r7 = r6.getContext()
            int r7 = defpackage.wbs.Q(r7, r9)
            r6.setTextColor(r7)
            boolean r7 = r6 instanceof com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView
            if (r7 == 0) goto Lcc
            com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView r6 = (com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView) r6
            if (r1 == 0) goto L7f
            r6.e()
            goto Lcc
        L7f:
            r6.a()
            goto Lcc
        L83:
            if (r0 == 0) goto Lad
            r7 = 2132019097(0x7f140799, float:1.967652E38)
            r6.setText(r7)
            r6.setVisibility(r4)
            android.content.Context r7 = r6.getContext()
            int r7 = defpackage.wbs.Q(r7, r9)
            r6.setTextColor(r7)
            boolean r7 = r6 instanceof com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView
            if (r7 == 0) goto Lcc
            com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView r6 = (com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView) r6
            int[] r7 = r6.c
            int[] r8 = com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView.a
            if (r7 == r8) goto Lcc
            int[] r7 = com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView.a
            r6.c = r7
            r6.refreshDrawableState()
            goto Lcc
        Lad:
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto Lcc
            if (r8 == 0) goto Lb8
            r6.setContentDescription(r8)
        Lb8:
            android.content.Context r7 = r6.getContext()
            int r7 = defpackage.wbs.Q(r7, r9)
            r6.setTextColor(r7)
            boolean r7 = r6 instanceof com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView
            if (r7 == 0) goto Lcc
            com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView r6 = (com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView) r6
            r6.a()
        Lcc:
            if (r10 != 0) goto Ld2
            if (r0 == 0) goto Ld1
            goto Ld2
        Ld1:
            return r4
        Ld2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkc.k(android.widget.TextView, java.lang.CharSequence, java.lang.CharSequence, java.util.List, avrx):boolean");
    }

    public static void l(TextView textView, avfx avfxVar) {
        aqyg aqygVar;
        textView.getClass();
        if (textView instanceof DurationBadgeView) {
            DurationBadgeView durationBadgeView = (DurationBadgeView) textView;
            int aq = awxr.aq(avfxVar.e);
            if (aq == 0) {
                aq = 1;
            }
            int i = aq - 1;
            if (i == 2) {
                durationBadgeView.e();
                textView.setTextColor(wbs.Q(textView.getContext(), R.attr.ytStaticWhite));
            } else if (i != 5) {
                durationBadgeView.a();
                textView.setTextColor(wbs.Q(textView.getContext(), R.attr.ytStaticWhite));
            } else {
                if (durationBadgeView.c != DurationBadgeView.b) {
                    durationBadgeView.c = DurationBadgeView.b;
                    durationBadgeView.refreshDrawableState();
                }
                textView.setTextColor(aih.d(textView.getContext(), R.color.yt_black1));
            }
        }
        aqyg aqygVar2 = avfxVar.d;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar2);
        if (!TextUtils.isEmpty(b)) {
            textView.setVisibility(0);
            textView.setText(b);
            if ((avfxVar.b & 2) != 0) {
                aqygVar = avfxVar.d;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView.setContentDescription(ajcq.i(aqygVar));
        }
        arfs arfsVar = avfxVar.c;
        if (arfsVar == null) {
            arfsVar = arfs.a;
        }
        arfr b2 = arfr.b(arfsVar.c);
        if (b2 == null) {
            b2 = arfr.UNKNOWN;
        }
        if (b2 == arfr.LIVE) {
            Drawable drawable = textView.getContext().getResources().getDrawable(R.drawable.quantum_ic_youtube_live_white_18);
            drawable.setColorFilter(new PorterDuffColorFilter(aih.d(textView.getContext(), R.color.yt_white1), PorterDuff.Mode.SRC_IN));
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            int K = yjk.K(textView.getContext().getResources().getDisplayMetrics(), 14);
            textView.setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(textView.getContext().getResources(), Bitmap.createScaledBitmap(bitmap, K, K, false)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(textView.getPaddingLeft());
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static void m(TextView textView, CharSequence charSequence, CharSequence charSequence2, List list, avrx avrxVar) {
        avfx i = i(list);
        if (i == null) {
            k(textView, charSequence, charSequence2, list, avrxVar);
            return;
        }
        if (textView != null) {
            l(textView, i);
        }
        awxr.aq(i.e);
        awxr.aq(i.e);
    }

    public static atta n(auzj auzjVar) {
        auzp auzpVar = auzjVar.r;
        if (auzpVar == null) {
            auzpVar = auzp.a;
        }
        if ((auzpVar.b & 1) == 0) {
            return null;
        }
        auzp auzpVar2 = auzjVar.r;
        if (auzpVar2 == null) {
            auzpVar2 = auzp.a;
        }
        atta attaVar = auzpVar2.c;
        return attaVar == null ? atta.a : attaVar;
    }

    public static aone o(Context context, aone aoneVar, CharSequence charSequence) {
        if (aoneVar == null) {
            return null;
        }
        aoneVar.copyOnWrite();
        auzj auzjVar = (auzj) aoneVar.instance;
        auzj auzjVar2 = auzj.a;
        auzjVar.r = null;
        auzjVar.b &= -131073;
        p(context, aoneVar, charSequence);
        return aoneVar;
    }

    public static void p(Context context, aone aoneVar, CharSequence charSequence) {
        if (aoneVar == null || n((auzj) aoneVar.build()) != null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        Spanned fromHtml = Html.fromHtml(context.getString(R.string.unsubscribe_confirmation, charSequence));
        String string = context.getString(android.R.string.ok);
        String string2 = context.getString(android.R.string.cancel);
        aone createBuilder = atta.a.createBuilder();
        aqyg h = ajcq.h(fromHtml.toString());
        createBuilder.copyOnWrite();
        atta attaVar = (atta) createBuilder.instance;
        h.getClass();
        attaVar.d = h;
        attaVar.b |= 2;
        aqyg h2 = ajcq.h(string.toString());
        createBuilder.copyOnWrite();
        atta attaVar2 = (atta) createBuilder.instance;
        h2.getClass();
        attaVar2.g = h2;
        attaVar2.b |= 16;
        aqyg h3 = ajcq.h(string2.toString());
        createBuilder.copyOnWrite();
        atta attaVar3 = (atta) createBuilder.instance;
        h3.getClass();
        attaVar3.e = h3;
        attaVar3.b |= 4;
        createBuilder.copyOnWrite();
        atta attaVar4 = (atta) createBuilder.instance;
        attaVar4.b |= 8;
        attaVar4.f = true;
        atta attaVar5 = (atta) createBuilder.build();
        aone createBuilder2 = auzp.a.createBuilder();
        createBuilder2.copyOnWrite();
        auzp auzpVar = (auzp) createBuilder2.instance;
        attaVar5.getClass();
        auzpVar.c = attaVar5;
        auzpVar.b |= 1;
        aoneVar.copyOnWrite();
        auzj auzjVar = (auzj) aoneVar.instance;
        auzp auzpVar2 = (auzp) createBuilder2.build();
        auzj auzjVar2 = auzj.a;
        auzpVar2.getClass();
        auzjVar.r = auzpVar2;
        auzjVar.b |= 131072;
    }

    public static final void q(FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
        FileChannel fileChannel;
        FileChannel channel;
        FileChannel fileChannel2 = null;
        try {
            channel = fileInputStream.getChannel();
        } catch (Throwable th) {
            th = th;
            fileChannel = null;
        }
        try {
            fileChannel2 = fileOutputStream.getChannel();
            fileChannel2.transferFrom(channel, 0L, channel.size());
            if (channel != null) {
                channel.close();
            }
            if (fileChannel2 != null) {
                fileChannel2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            FileChannel fileChannel3 = fileChannel2;
            fileChannel2 = channel;
            fileChannel = fileChannel3;
            if (fileChannel2 != null) {
                fileChannel2.close();
            }
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th;
        }
    }

    public static String r(Context context, long j, long j2) {
        return context.getResources().getString(R.string.accessibility_trim_progress_time, wbs.ay(context.getResources(), s(j)), wbs.ay(context.getResources(), s(j2)));
    }

    public static String s(long j) {
        return zhq.i(TimeUnit.MILLISECONDS.toSeconds(j));
    }

    public static int[] t() {
        return new int[]{1, 2, 3};
    }

    public static int u(hpb hpbVar) {
        hpbVar.d();
        return (int) ((ShortsVideoMetadata) ((amna) hpbVar.d()).a).c();
    }

    public static aqqz v(zsl zslVar, hkq hkqVar) {
        aqqx aqqxVar;
        aone createBuilder = aqqz.a.createBuilder();
        aone createBuilder2 = aqqy.a.createBuilder();
        aone createBuilder3 = aqra.a.createBuilder();
        String str = zslVar.b;
        createBuilder3.copyOnWrite();
        aqra aqraVar = (aqra) createBuilder3.instance;
        str.getClass();
        aqraVar.b |= 2;
        aqraVar.d = str;
        String str2 = zslVar.e;
        createBuilder3.copyOnWrite();
        aqra aqraVar2 = (aqra) createBuilder3.instance;
        str2.getClass();
        aqraVar2.b |= 1;
        aqraVar2.c = str2;
        createBuilder3.copyOnWrite();
        aqra aqraVar3 = (aqra) createBuilder3.instance;
        aqraVar3.b |= 4;
        aqraVar3.e = "SHORTS_PRESETS";
        aqra aqraVar4 = (aqra) createBuilder3.build();
        createBuilder2.copyOnWrite();
        aqqy aqqyVar = (aqqy) createBuilder2.instance;
        aqraVar4.getClass();
        aqqyVar.c = aqraVar4;
        aqqyVar.b |= 1;
        createBuilder2.copyOnWrite();
        aqqy aqqyVar2 = (aqqy) createBuilder2.instance;
        aqqyVar2.b |= 2;
        aqqyVar2.d = 1.0d;
        createBuilder.copyOnWrite();
        aqqz aqqzVar = (aqqz) createBuilder.instance;
        aqqy aqqyVar3 = (aqqy) createBuilder2.build();
        aqqyVar3.getClass();
        aqqzVar.c = aqqyVar3;
        aqqzVar.b |= 1;
        if (hkqVar != null) {
            if (hkqVar.a) {
                aone createBuilder4 = aqqx.a.createBuilder();
                if ("".equals(hkqVar.d)) {
                    createBuilder4.copyOnWrite();
                    aqqx aqqxVar2 = (aqqx) createBuilder4.instance;
                    aqqxVar2.c = 1;
                    aqqxVar2.b |= 1;
                } else {
                    createBuilder4.copyOnWrite();
                    aqqx aqqxVar3 = (aqqx) createBuilder4.instance;
                    aqqxVar3.c = 2;
                    aqqxVar3.b |= 1;
                }
                if (hkqVar.e.containsKey(hkqVar.d)) {
                    int intValue = ((Integer) hkqVar.e.get(hkqVar.d)).intValue();
                    createBuilder4.copyOnWrite();
                    aqqx aqqxVar4 = (aqqx) createBuilder4.instance;
                    aqqxVar4.b |= 2;
                    aqqxVar4.d = intValue;
                }
                aqqxVar = (aqqx) createBuilder4.build();
            } else {
                aqqxVar = null;
            }
            if (aqqxVar != null) {
                createBuilder.copyOnWrite();
                aqqz aqqzVar2 = (aqqz) createBuilder.instance;
                aqqzVar2.d = aqqxVar;
                aqqzVar2.b |= 2;
            }
        }
        return (aqqz) createBuilder.build();
    }

    public static avwl w(int i, int i2) {
        aone createBuilder = avwl.a.createBuilder();
        createBuilder.copyOnWrite();
        avwl avwlVar = (avwl) createBuilder.instance;
        avwlVar.b |= 1;
        avwlVar.c = i;
        aoms b = aoqx.b(i2);
        createBuilder.copyOnWrite();
        avwl avwlVar2 = (avwl) createBuilder.instance;
        b.getClass();
        avwlVar2.d = b;
        avwlVar2.b |= 2;
        return (avwl) createBuilder.build();
    }

    public static final void x(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat) {
        if (bitmap == null) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        file.createNewFile();
        bitmap.compress(compressFormat, 100, new FileOutputStream(file));
    }

    public static long y(SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand) {
        if (sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.f.isEmpty()) {
            return 0L;
        }
        return ((auri) sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.f.get(0)).b;
    }

    public static long z(auti autiVar) {
        auth authVar = autiVar.f;
        if (authVar == null) {
            authVar = auth.a;
        }
        return authVar.c;
    }
}
