package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import com.google.android.material.textview.MaterialTextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vpm extends LinearLayout implements axql, axqh {
    public boolean a;
    public vrp b;
    public vkb c;
    public tgn d;
    public tgd e;
    public vnk f;
    public vpn g;
    public MaterialTextView h;
    public vqc i;
    private axqg j;

    public vpm(Context context) {
        super(context);
        axqk a = lL().a();
        if ((a instanceof axqk) && ((!(a instanceof axqh) || ((axqh) a).h()) && !this.a)) {
            this.a = true;
            ((vpl) lM()).d(this);
        }
        setOrientation(1);
        if (!this.a) {
            Object context2 = getContext();
            while (!(context2 instanceof axpj) && (context2 instanceof ContextWrapper)) {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            ((axpj) context2).g().g(this);
        }
        inflate(getContext(), true != axxp.d() ? R.layout.photo_picker_google_photos_section : R.layout.photo_picker_google_photos_section_art_style, this);
        this.h = (MaterialTextView) findViewById(R.id.photo_picker_suggested_section_title);
        this.g = new vpn((TableLayout) findViewById(R.id.photo_picker_suggested_photos_grid), getContext().getResources().getInteger(R.integer.photo_picker_num_columns));
    }

    @Override // defpackage.axql
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final axqg lL() {
        if (this.j == null) {
            this.j = new axqg(this, true);
        }
        return this.j;
    }

    public final List b(amru amruVar) {
        final SquareImageView squareImageView;
        ArrayList arrayList = new ArrayList();
        int size = amruVar.size();
        for (int i = 0; i < size; i++) {
            aodg aodgVar = (aodg) amruVar.get(i);
            if ((aodgVar.b & 1) != 0) {
                if (axxp.d()) {
                    squareImageView = SquareImageView.a(getContext());
                } else {
                    squareImageView = new SquareImageView(getContext());
                }
                if ((aodgVar.b & 8) != 0) {
                    Context context = getContext();
                    Object[] objArr = new Object[1];
                    aoqa aoqaVar = aodgVar.f;
                    if (aoqaVar == null) {
                        aoqaVar = aoqa.a;
                    }
                    objArr[0] = vls.h(aoqaVar);
                    squareImageView.setContentDescription(context.getString(R.string.op3_picker_accessibility_photo, objArr));
                }
                final Uri c = vls.c(aodgVar);
                vkb vkbVar = this.c;
                aoae aoaeVar = new aoae((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                aoaeVar.u();
                vkbVar.c(c, aoaeVar, squareImageView);
                this.d.a.a(89756).a(squareImageView);
                squareImageView.setOnClickListener(new View.OnClickListener() { // from class: vpk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        vpm vpmVar = vpm.this;
                        SquareImageView squareImageView2 = squareImageView;
                        Uri uri = c;
                        vpmVar.e.a(tgc.a(), squareImageView2);
                        vpmVar.f.a = awzc.OBAKE_GOOGLE_PHOTOS_PHOTO_SELECTED;
                        vpmVar.b.i(uri);
                    }
                });
                arrayList.add(squareImageView);
            }
        }
        return arrayList;
    }

    public final void c(int i) {
        this.d.a.a(i).a(this);
    }

    public final void f(int i) {
        this.h.setText(getContext().getString(i));
    }

    @Override // defpackage.axqh
    public final boolean h() {
        return this.a;
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }
}
