package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.emoji.widget.EmojiTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hzg extends iah implements View.OnClickListener {
    private auya A;
    private EmojiTextView B;
    public final FrameLayout t;
    public final ImageView u;
    public final iag v;
    public Bitmap w;
    private final ica y;
    private final aok z;

    public hzg(View view, iag iagVar, ica icaVar, aok aokVar) {
        super(view);
        this.t = (FrameLayout) view.findViewById(R.id.dynamic_sticker_container);
        this.u = (ImageView) view.findViewById(R.id.sticker);
        this.v = iagVar;
        this.y = icaVar;
        this.z = aokVar;
    }

    private final View G(Context context, int i, int i2) {
        View inflate = LayoutInflater.from(new ContextThemeWrapper(context, i2)).inflate(i, new FrameLayout(context));
        TextView textView = (TextView) inflate.findViewById(R.id.text);
        aqyg aqygVar = this.A.d;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar);
        textView.setText(b);
        textView.setAllCaps(true);
        this.u.setContentDescription(b != null ? b.toString() : "");
        return inflate;
    }

    private final void H(auya auyaVar) {
        if (this.v.a() == null) {
            return;
        }
        this.v.a().I(3, etx.E(auyaVar), null);
    }

    private final void I(auya auyaVar) {
        aqyg aqygVar = auyaVar.d;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar);
        this.u.setContentDescription(b != null ? b.toString() : "");
    }

    @Override // defpackage.iah
    public final void E() {
        if (!this.x.pY(StickerCatalogRendererOuterClass.dynamicStickerRenderer)) {
            throw new IllegalArgumentException("renderer missing");
        }
        this.A = (auya) this.x.pX(StickerCatalogRendererOuterClass.dynamicStickerRenderer);
        Context context = this.u.getContext();
        int ai = aobq.ai(this.A.c);
        if (ai == 0) {
            ai = 1;
        }
        switch (ai - 1) {
            case 1:
                Bitmap A = wcy.A(context, G(context, R.layout.location_sticker, ((Integer) hzu.a.get(hzu.b)).intValue()));
                this.w = A;
                this.u.setImageBitmap(A);
                break;
            case 2:
                View G = G(context, R.layout.user_mention_sticker, ((Integer) ibe.a.get(ibe.b)).intValue());
                ((iai) this.v).i.e((ImageView) G.findViewById(R.id.icon));
                Bitmap A2 = wcy.A(context, G);
                this.w = A2;
                this.u.setImageBitmap(A2);
                break;
            case 3:
                if (this.B == null) {
                    this.B = (EmojiTextView) ((ViewStub) this.t.findViewById(R.id.unicode_emoji_sticker_stub)).inflate();
                }
                EmojiTextView emojiTextView = this.B;
                int i = this.t.getLayoutParams().height;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.unicode_emoji_sticker_padding);
                emojiTextView.setTextSize(1, (int) (Math.min(i - (dimensionPixelSize + dimensionPixelSize), context.getResources().getDimensionPixelSize(R.dimen.dynamic_sticker_max_height)) / context.getResources().getDisplayMetrics().scaledDensity));
                EmojiTextView emojiTextView2 = this.B;
                aqyg aqygVar = this.A.d;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                emojiTextView2.setText(ajcq.b(aqygVar));
                break;
            case 4:
                View inflate = LayoutInflater.from(context).inflate(R.layout.date_sticker, new FrameLayout(context));
                ((TextView) inflate.findViewById(R.id.date)).setText(new SimpleDateFormat("d", Locale.getDefault()).format(new Date()));
                Bitmap A3 = wcy.A(context, inflate);
                this.w = A3;
                this.u.setImageBitmap(A3);
                I(this.A);
                break;
            case 5:
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.time_sticker, new FrameLayout(context));
                ((TextView) inflate2.findViewById(R.id.time)).setText(new SimpleDateFormat("h:mm", Locale.getDefault()).format(new Date()));
                ((TextView) inflate2.findViewById(R.id.am_pm_indicator)).setText(Calendar.getInstance().getDisplayName(9, 1, Locale.getDefault()));
                Bitmap A4 = wcy.A(context, inflate2);
                this.w = A4;
                this.u.setImageBitmap(A4);
                I(this.A);
                break;
            case 6:
            default:
                int ai2 = aobq.ai(this.A.c);
                int i2 = ai2 != 0 ? ai2 : 1;
                StringBuilder sb = new StringBuilder(28);
                sb.append("unexpected type: ");
                sb.append(i2 - 1);
                throw new IllegalArgumentException(sb.toString());
            case 7:
                Bitmap A5 = wcy.A(context, G(context, R.layout.video_sticker_picker, R.style.NormalDynamicSticker));
                this.w = A5;
                this.u.setImageBitmap(A5);
                break;
            case 8:
                ImageView imageView = (ImageView) LayoutInflater.from(context).inflate(R.layout.day_of_week_sticker, (ViewGroup) null);
                String str = (String) icg.c.get(Integer.valueOf(Calendar.getInstance().get(7)));
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 77);
                sb2.append("https://www.gstatic.com/youtube/kazoo/server/assets/stickers/day_of_week_");
                sb2.append(str);
                sb2.append(".png");
                this.y.a(Uri.parse(sb2.toString()), new hzf(this, imageView, context));
                break;
            case 9:
                Bitmap A6 = wcy.A(context, G(context, R.layout.link_sticker, R.style.NormalDynamicSticker));
                this.w = A6;
                this.u.setImageBitmap(A6);
                break;
        }
        this.t.setOnClickListener(this);
        auya auyaVar = this.A;
        if (this.v.a() == null) {
            return;
        }
        this.v.a().u(etx.E(auyaVar), null);
    }

    @Override // defpackage.iah
    public final void F() {
        this.u.setImageDrawable(null);
        Bitmap bitmap = this.w;
        if (bitmap != null) {
            bitmap.recycle();
            this.w = null;
        }
        EmojiTextView emojiTextView = this.B;
        if (emojiTextView != null) {
            emojiTextView.setText((CharSequence) null);
        }
        this.A = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int ai = aobq.ai(this.A.c);
        if (ai == 0) {
            ai = 1;
        }
        switch (ai - 1) {
            case 1:
                H(this.A);
                hzu hzuVar = ((iai) this.v).h;
                aong aongVar = (aong) aulq.a.createBuilder();
                aongVar.e(StickerCatalogRendererOuterClass.dynamicStickerRenderer, this.A);
                aulq aulqVar = (aulq) aongVar.build();
                boolean z = ((iai) this.v).u;
                hzuVar.l = aulqVar;
                hzuVar.m = z;
                if (!hzuVar.e || akai.g(hzuVar.c)) {
                    hzuVar.f();
                    return;
                } else {
                    hzuVar.g = hzuVar.c();
                    hzuVar.g.a();
                    return;
                }
            case 2:
                H(this.A);
                ibe ibeVar = ((iai) this.v).i;
                aong aongVar2 = (aong) aulq.a.createBuilder();
                aongVar2.e(StickerCatalogRendererOuterClass.dynamicStickerRenderer, this.A);
                aulq aulqVar2 = (aulq) aongVar2.build();
                boolean z2 = ((iai) this.v).u;
                ibeVar.i = aulqVar2;
                ibeVar.j = z2;
                ibeVar.l.b();
                ibeVar.g.setVisibility(0);
                ipa ipaVar = ibeVar.h;
                if (!TextUtils.isEmpty(ipaVar.d.getText())) {
                    ipaVar.d.setText("");
                }
                ipaVar.d.requestFocus();
                whu.J(ipaVar.d);
                ipaVar.a(ipaVar.a.getString(R.string.user_mention_search_view_results_box_hint));
                ipaVar.c.e();
                return;
            case 3:
                ((iai) this.v).x.h(this.x, this.z);
                this.t.removeView(this.B);
                H(this.A);
                ((iai) this.v).v.a();
                iai iaiVar = (iai) this.v;
                hyh hyhVar = iaiVar.j;
                EmojiTextView emojiTextView = this.B;
                boolean z3 = iaiVar.u;
                axdj j = axdk.j();
                String charSequence = emojiTextView.getText().toString();
                if (!hyhVar.c.a(charSequence).isEmpty()) {
                    hyhVar.d.mM().n(new acqx(acsb.c(65452)));
                }
                aone createBuilder = axed.a.createBuilder();
                createBuilder.copyOnWrite();
                axed axedVar = (axed) createBuilder.instance;
                charSequence.getClass();
                axedVar.b |= 2;
                axedVar.d = charSequence;
                amru a = hyhVar.c.a(charSequence);
                if (!a.isEmpty()) {
                    aone createBuilder2 = axee.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    axee axeeVar = (axee) createBuilder2.instance;
                    charSequence.getClass();
                    axeeVar.b |= 1;
                    axeeVar.c = charSequence;
                    createBuilder2.copyOnWrite();
                    axee axeeVar2 = (axee) createBuilder2.instance;
                    aony aonyVar = axeeVar2.d;
                    if (!aonyVar.c()) {
                        axeeVar2.d = aonm.mutableCopy(aonyVar);
                    }
                    aolo.addAll((Iterable) a, (List) axeeVar2.d);
                    axee axeeVar3 = (axee) createBuilder2.build();
                    createBuilder.copyOnWrite();
                    axed axedVar2 = (axed) createBuilder.instance;
                    axeeVar3.getClass();
                    axedVar2.e = axeeVar3;
                    axedVar2.b |= 4;
                }
                aone createBuilder3 = axdi.a.createBuilder();
                createBuilder3.copyOnWrite();
                axdi axdiVar = (axdi) createBuilder3.instance;
                axed axedVar3 = (axed) createBuilder.build();
                axedVar3.getClass();
                axdiVar.d = axedVar3;
                axdiVar.c = 7;
                createBuilder3.copyOnWrite();
                axdi axdiVar2 = (axdi) createBuilder3.instance;
                axdiVar2.b |= 4096;
                axdiVar2.e = z3;
                boolean u = hyhVar.g.u();
                createBuilder3.copyOnWrite();
                axdi axdiVar3 = (axdi) createBuilder3.instance;
                axdiVar3.b |= 8192;
                axdiVar3.f = u;
                j.copyOnWrite();
                ((axdk) j.instance).F((axdi) createBuilder3.build());
                etx.aq(hyhVar.a, hyhVar.f, emojiTextView, j, new hyf(hyhVar, r0));
                return;
            case 4:
                H(this.A);
                ((iai) this.v).x.h(this.x, this.z);
                ((iai) this.v).v.a();
                iai iaiVar2 = (iai) this.v;
                ico icoVar = iaiVar2.w;
                Bitmap bitmap = this.w;
                boolean z4 = iaiVar2.u;
                aone createBuilder4 = axdi.a.createBuilder();
                createBuilder4.copyOnWrite();
                axdi axdiVar4 = (axdi) createBuilder4.instance;
                axdiVar4.b |= 4096;
                axdiVar4.e = z4;
                axby axbyVar = axby.a;
                createBuilder4.copyOnWrite();
                axdi axdiVar5 = (axdi) createBuilder4.instance;
                axbyVar.getClass();
                axdiVar5.d = axbyVar;
                axdiVar5.c = 9;
                boolean u2 = icoVar.d.u();
                createBuilder4.copyOnWrite();
                axdi axdiVar6 = (axdi) createBuilder4.instance;
                axdiVar6.b |= 8192;
                axdiVar6.f = u2;
                axdi axdiVar7 = (axdi) createBuilder4.build();
                axdj j2 = axdk.j();
                j2.copyOnWrite();
                ((axdk) j2.instance).F(axdiVar7);
                etx.D(icoVar.a, bitmap, j2, new icb(icoVar.b, 0));
                return;
            case 5:
                H(this.A);
                ((iai) this.v).x.h(this.x, this.z);
                ((iai) this.v).v.a();
                iai iaiVar3 = (iai) this.v;
                ico icoVar2 = iaiVar3.m;
                Bitmap bitmap2 = this.w;
                boolean z5 = iaiVar3.u;
                aone createBuilder5 = axdi.a.createBuilder();
                createBuilder5.copyOnWrite();
                axdi axdiVar8 = (axdi) createBuilder5.instance;
                axdiVar8.b |= 4096;
                axdiVar8.e = z5;
                axdz axdzVar = axdz.a;
                createBuilder5.copyOnWrite();
                axdi axdiVar9 = (axdi) createBuilder5.instance;
                axdzVar.getClass();
                axdiVar9.d = axdzVar;
                axdiVar9.c = 8;
                boolean u3 = icoVar2.d.u();
                createBuilder5.copyOnWrite();
                axdi axdiVar10 = (axdi) createBuilder5.instance;
                axdiVar10.b |= 8192;
                axdiVar10.f = u3;
                axdi axdiVar11 = (axdi) createBuilder5.build();
                axdj j3 = axdk.j();
                j3.copyOnWrite();
                ((axdk) j3.instance).F(axdiVar11);
                etx.D(icoVar2.a, bitmap2, j3, new icb(icoVar2.b, 3));
                return;
            case 6:
            default:
                int ai2 = aobq.ai(this.A.c);
                r0 = ai2 != 0 ? ai2 : 1;
                StringBuilder sb = new StringBuilder(28);
                sb.append("unexpected type: ");
                sb.append(r0 - 1);
                throw new IllegalArgumentException(sb.toString());
            case 7:
                H(this.A);
                iai iaiVar4 = (iai) this.v;
                ibq ibqVar = iaiVar4.k;
                aulq aulqVar3 = this.x;
                boolean z6 = iaiVar4.u;
                ibqVar.j.h(aulqVar3, ibqVar.a);
                ibqVar.h = z6;
                new ibm().qh(ibqVar.a.getSupportFragmentManager(), "reels_video_picker_fragment");
                return;
            case 8:
                H(this.A);
                ((iai) this.v).x.h(this.x, this.z);
                ((iai) this.v).v.a();
                iai iaiVar5 = (iai) this.v;
                final icg icgVar = iaiVar5.n;
                Bitmap bitmap3 = this.w;
                boolean z7 = iaiVar5.u;
                icgVar.g.mM().n(new acqx(acsb.c(65452)));
                aone createBuilder6 = axdi.a.createBuilder();
                createBuilder6.copyOnWrite();
                axdi axdiVar12 = (axdi) createBuilder6.instance;
                axdiVar12.b |= 4096;
                axdiVar12.e = z7;
                aone createBuilder7 = axbz.a.createBuilder();
                aone createBuilder8 = axca.b.createBuilder();
                axcb axcbVar = icg.a;
                createBuilder8.copyOnWrite();
                axca axcaVar = (axca) createBuilder8.instance;
                axcaVar.d = axcbVar.d;
                axcaVar.c |= 1;
                amsx amsxVar = icg.b;
                createBuilder8.copyOnWrite();
                axca axcaVar2 = (axca) createBuilder8.instance;
                aonu aonuVar = axcaVar2.e;
                if (!aonuVar.c()) {
                    axcaVar2.e = aonm.mutableCopy(aonuVar);
                }
                Iterator<E> it = amsxVar.iterator();
                while (it.hasNext()) {
                    axcaVar2.e.g(((axcb) it.next()).d);
                }
                axca axcaVar3 = (axca) createBuilder8.build();
                createBuilder7.copyOnWrite();
                axbz axbzVar = (axbz) createBuilder7.instance;
                axcaVar3.getClass();
                axbzVar.d = axcaVar3;
                axbzVar.b |= 2;
                createBuilder6.copyOnWrite();
                axdi axdiVar13 = (axdi) createBuilder6.instance;
                axbz axbzVar2 = (axbz) createBuilder7.build();
                axbzVar2.getClass();
                axdiVar13.d = axbzVar2;
                axdiVar13.c = 12;
                createBuilder6.copyOnWrite();
                axdi axdiVar14 = (axdi) createBuilder6.instance;
                axdiVar14.b |= 8192;
                axdiVar14.f = true;
                axdi axdiVar15 = (axdi) createBuilder6.build();
                axdj j4 = axdk.j();
                j4.copyOnWrite();
                ((axdk) j4.instance).F(axdiVar15);
                Matrix matrix = new Matrix();
                matrix.preScale(0.5f, 0.5f, 0.5f, 0.5f);
                aorq G = wcy.G(matrix);
                j4.copyOnWrite();
                ((axdk) j4.instance).E(G);
                etx.D(icgVar.d, bitmap3, j4, new ici() { // from class: icc
                    @Override // defpackage.ici
                    public final void a(axdj axdjVar) {
                        icg icgVar2 = icg.this;
                        icgVar2.f.aI(axdjVar);
                        icgVar2.h.d(axdjVar);
                    }
                });
                return;
            case 9:
                H(this.A);
                ((iai) this.v).x.h(this.x, this.z);
                ick ickVar = ((iai) this.v).o;
                try {
                    final iat iatVar = ickVar.c;
                    if (((Boolean) ynm.b(iatVar.c, iatVar.d.a(), new amml() { // from class: iap
                        @Override // defpackage.amml
                        public final Object apply(Object obj) {
                            iat iatVar2 = iat.this;
                            idr idrVar = (idr) obj;
                            if (idrVar.e == 0) {
                                return true;
                            }
                            return Boolean.valueOf(iatVar2.b.c() - idrVar.e > iat.a);
                        }
                    }).get()).booleanValue()) {
                        ickVar.d.G();
                    } else {
                        ickVar.e.G();
                    }
                } catch (Exception e) {
                    zga.d("Error reading from protoDataStore", e);
                }
                ((iai) this.v).v.a();
                return;
        }
    }
}
