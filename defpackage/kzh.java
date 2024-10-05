package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kzh implements View.OnClickListener, ajom {
    static final amrz a = amrz.k("offline_playlist_top_level_tab_id", "FEwhat_to_watch");
    private final Resources b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final RecyclerView g;
    private final RelativeLayout h;
    private final ImageView i;
    private final TextView j;
    private final ImageView k;
    private final kzg l;
    private final aahd m;
    private final shf n;
    private final ajjz o;
    private kyt p;
    private ajok q;

    public kzh(Context context, aahd aahdVar, ajyw ajywVar, shf shfVar, ajjz ajjzVar, ViewGroup viewGroup, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.m = aahdVar;
        this.o = ajjzVar;
        this.n = shfVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.commute_shelf_item, viewGroup, false);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.metadata);
        this.f = (TextView) inflate.findViewById(R.id.description);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.collage);
        this.g = recyclerView;
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.thumbnail_layout);
        this.h = relativeLayout;
        this.i = (ImageView) relativeLayout.findViewById(R.id.thumbnail);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.duration);
        this.j = textView;
        textView.setTypeface(textView.getTypeface(), 1);
        this.k = (ImageView) inflate.findViewById(R.id.offline_badge);
        Resources resources = context.getResources();
        this.b = resources;
        kzg o = ajywVar.o(new we(resources.getDimensionPixelSize(R.dimen.offline_commute_playlist_item_image_width), resources.getDimensionPixelSize(R.dimen.offline_commute_playlist_item_image_height)), new we(resources.getDimensionPixelSize(R.dimen.offline_commute_playlist_item_image_width), resources.getDimensionPixelSize(R.dimen.offline_commute_playlist_item_image_double_height)), resources.getDimensionPixelSize(R.dimen.offline_commute_playlist_item_avatar_width_height));
        this.l = o;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.g = new kzc(o);
        recyclerView.af(gridLayoutManager);
        recyclerView.ac(o);
        recyclerView.aB(new kzb(o, resources.getDimensionPixelSize(R.dimen.offline_commute_playlist_item_image_padding)));
        inflate.setOnClickListener(this);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        avgg avggVar;
        Drawable drawable;
        String str;
        kyt kytVar = (kyt) obj;
        this.p = kytVar;
        this.q = ajokVar;
        if (!kytVar.a) {
            if (!kytVar.h.isEmpty()) {
                avggVar = (avgg) kytVar.h.get(0);
            } else {
                avggVar = avgg.a;
            }
            this.o.h(this.i, avggVar);
            whu.G(this.j, kytVar.j);
            this.h.setVisibility(0);
            this.g.setVisibility(8);
        } else {
            this.l.y(kytVar.l, kytVar.f, kytVar.h);
            this.l.mw();
            this.h.setVisibility(8);
            this.g.setVisibility(0);
        }
        whu.G(this.d, kytVar.c);
        if (kytVar.a) {
            drawable = this.b.getDrawable(R.drawable.quantum_ic_offline_pin_googblue_24);
        } else {
            drawable = this.b.getDrawable(R.drawable.quantum_ic_check_circle_white_24);
        }
        this.k.setImageDrawable(drawable);
        if (kytVar.a) {
            whu.I(this.e, false);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!ammx.e(kytVar.d)) {
                spannableStringBuilder.append((CharSequence) kytVar.d);
            }
            if (!ammx.e(kytVar.k)) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) " · ");
                }
                spannableStringBuilder.append((CharSequence) kytVar.k);
            }
            whu.G(this.e, spannableStringBuilder);
        }
        if (!kytVar.a) {
            whu.G(this.f, this.b.getString(R.string.offline_button_complete_text));
            this.f.setTextSize(2, 14.0f);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            Resources resources = this.b;
            int i = kytVar.g;
            spannableStringBuilder2.append((CharSequence) resources.getQuantityString(R.plurals.video_count, i, Integer.valueOf(i))).append((CharSequence) " · ");
            if ((!kytVar.a || !kytVar.b.startsWith("BL")) && (str = kytVar.d) != null) {
                spannableStringBuilder2.append((CharSequence) str);
            } else {
                spannableStringBuilder2.append((CharSequence) mcy.ac(this.b, this.n, kytVar.i.toEpochMilli()));
            }
            whu.G(this.f, spannableStringBuilder2);
            this.f.setTextSize(2, 12.0f);
        }
        awav d = d();
        if (d == null) {
            return;
        }
        this.q.a.o(adyu.ce(d), adyu.ce(ajnu.d(this.q)));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.p == null) {
            return;
        }
        awav d = d();
        if (d != null) {
            this.q.a.I(3, adyu.ce(d), null);
        }
        this.m.c(this.p.e, a);
    }

    private final awav d() {
        aone createBuilder;
        ajok ajokVar;
        kyt kytVar = this.p;
        awav awavVar = null;
        if (kytVar != null && (ajokVar = this.q) != null) {
            awavVar = ajokVar.a.j(kytVar.b, acsb.c(66335), this.q.b("position", -1));
        }
        if (awavVar == null) {
            return awavVar;
        }
        aone builder = awavVar.toBuilder();
        if (this.p.a) {
            createBuilder = apve.a.createBuilder();
            aone createBuilder2 = apvl.a.createBuilder();
            aomf z = aomf.z(this.p.b);
            createBuilder2.copyOnWrite();
            apvl apvlVar = (apvl) createBuilder2.instance;
            apvlVar.b |= 1;
            apvlVar.c = z;
            createBuilder.copyOnWrite();
            apve apveVar = (apve) createBuilder.instance;
            apvl apvlVar2 = (apvl) createBuilder2.build();
            apvlVar2.getClass();
            apveVar.e = apvlVar2;
            apveVar.b |= 4;
        } else {
            createBuilder = apve.a.createBuilder();
            aone createBuilder3 = apvj.a.createBuilder();
            aomf z2 = aomf.z(this.p.b);
            createBuilder3.copyOnWrite();
            apvj apvjVar = (apvj) createBuilder3.instance;
            apvjVar.b |= 1;
            apvjVar.c = z2;
            createBuilder.copyOnWrite();
            apve apveVar2 = (apve) createBuilder.instance;
            apvj apvjVar2 = (apvj) createBuilder3.build();
            apvjVar2.getClass();
            apveVar2.d = apvjVar2;
            apveVar2.b |= 2;
        }
        builder.copyOnWrite();
        awav awavVar2 = (awav) builder.instance;
        apve apveVar3 = (apve) createBuilder.build();
        apveVar3.getClass();
        awavVar2.h = apveVar3;
        awavVar2.b |= 64;
        return (awav) builder.build();
    }
}
