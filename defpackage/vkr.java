package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vkr extends vw {
    public amru d = amru.q();
    public final tgd e;
    public final vkv f;
    private final vkb g;
    private final tgn h;
    private final ammv i;

    public vkr(vkb vkbVar, tgn tgnVar, tgd tgdVar, vkv vkvVar, ammv ammvVar) {
        this.g = vkbVar;
        this.h = tgnVar;
        this.e = tgdVar;
        this.f = vkvVar;
        this.i = ammvVar;
    }

    @Override // defpackage.vw
    public final int b() {
        return this.d.size() + (this.i.h() ? 1 : 0);
    }

    @Override // defpackage.vw
    public final int c(int i) {
        return x(i) ? 0 : 1;
    }

    @Override // defpackage.vw
    public final wv f(ViewGroup viewGroup, int i) {
        SquareImageView squareImageView;
        if (i == 0) {
            return new vkp(LayoutInflater.from(viewGroup.getContext()).inflate(true != axxp.d() ? R.layout.photo_picker_photos_header_view : R.layout.photo_picker_photos_header_view_art_style, viewGroup, false));
        }
        if (axxp.d()) {
            squareImageView = new SquareImageView(viewGroup.getContext());
            squareImageView.d();
            squareImageView.setPadding(0, 0, 0, 0);
        } else {
            squareImageView = new SquareImageView(viewGroup.getContext());
        }
        return new vkq(squareImageView);
    }

    @Override // defpackage.vw
    public final void o(wv wvVar, int i) {
        if (c(i) == 0) {
            vkp vkpVar = (vkp) wvVar;
            vkb vkbVar = this.g;
            aodg aodgVar = ((aocu) this.i.c()).d;
            if (aodgVar == null) {
                aodgVar = aodg.a;
            }
            Uri c = vls.c(aodgVar);
            aoae aoaeVar = new aoae((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            aoaeVar.u();
            aoaeVar.b.add(vkc.CIRCLE_CROP);
            int i2 = vkp.v;
            ImageView imageView = vkpVar.t;
            ((con) vkbVar.b(imageView.getContext(), c, aoaeVar).H(cof.NORMAL)).o(imageView);
            if ((((aocu) this.i.c()).b & 4) != 0) {
                vkpVar.u.setText(((aocu) this.i.c()).e);
                return;
            }
            return;
        }
        final vkq vkqVar = (vkq) wvVar;
        int i3 = i - (this.i.h() ? 1 : 0);
        aodg aodgVar2 = (aodg) this.d.get(i3);
        int i4 = vkq.u;
        SquareImageView squareImageView = vkqVar.t;
        Context context = squareImageView.getContext();
        Object[] objArr = new Object[1];
        aoqa aoqaVar = aodgVar2.f;
        if (aoqaVar == null) {
            aoqaVar = aoqa.a;
        }
        objArr[0] = vls.h(aoqaVar);
        squareImageView.setContentDescription(context.getString(R.string.op3_picker_accessibility_photo, objArr));
        final Uri c2 = vls.c(aodgVar2);
        vkb vkbVar2 = this.g;
        aoae aoaeVar2 = new aoae((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        aoaeVar2.u();
        vkbVar2.c(c2, aoaeVar2, vkqVar.t);
        tfy a = this.h.a.a(89756);
        a.e(sgf.H(aodgVar2.c.hashCode()));
        a.e(sgf.R(i3));
        a.b(vkqVar.t);
        vkqVar.t.setOnClickListener(new View.OnClickListener() { // from class: vko
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vkr vkrVar = vkr.this;
                vkq vkqVar2 = vkqVar;
                Uri uri = c2;
                tgd tgdVar = vkrVar.e;
                tgc a2 = tgc.a();
                int i5 = vkq.u;
                tgdVar.a(a2, vkqVar2.t);
                vkv vkvVar = vkrVar.f;
                vnk vnkVar = vkvVar.a;
                vrp vrpVar = vkvVar.b;
                vnkVar.a = awzc.OBAKE_GOOGLE_PHOTOS_PHOTO_SELECTED;
                vrpVar.i(uri);
            }
        });
    }

    @Override // defpackage.vw
    public final void p(wv wvVar) {
        if (wvVar instanceof vkq) {
            int i = vkq.u;
            tgk.d(((vkq) wvVar).t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w() {
        return this.i.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean x(int i) {
        return this.i.h() && i == 0;
    }
}
