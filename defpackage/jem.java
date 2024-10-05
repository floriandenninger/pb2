package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jem {
    public final CompoundButton.OnCheckedChangeListener a;
    public jel b;
    public PlayerResponseModel c;
    public boolean d = true;
    public boolean e = true;
    public boolean f = false;
    public jgk g;

    public jem(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.a = onCheckedChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        String string;
        this.f = z;
        jel jelVar = this.b;
        if (jelVar != null) {
            jeq jeqVar = (jeq) jelVar;
            jeqVar.e.setOnCheckedChangeListener(null);
            jeqVar.e.setChecked(z);
            Optional optional = jeqVar.k;
            final Switch r1 = jeqVar.e;
            r1.getClass();
            optional.ifPresent(new Consumer() { // from class: jeo
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    r1.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) obj);
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            });
            TextView textView = jeqVar.d;
            if (jeqVar.e.isChecked()) {
                string = jeqVar.b.getString(R.string.mdx_autonav_label_on);
            } else {
                string = jeqVar.b.getString(R.string.mdx_autonav_label_off);
            }
            textView.setText(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        this.e = z;
        jel jelVar = this.b;
        if (jelVar != null) {
            ((jeq) jelVar).c.setVisibility(true != z ? 8 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        this.d = z;
        jel jelVar = this.b;
        if (jelVar != null) {
            ((jeq) jelVar).f.setVisibility(true != z ? 8 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(PlayerResponseModel playerResponseModel, final jgk jgkVar) {
        this.c = playerResponseModel;
        this.g = jgkVar;
        jel jelVar = this.b;
        if (jelVar == null || playerResponseModel == null || jgkVar == null) {
            return;
        }
        jeq jeqVar = (jeq) jelVar;
        jeqVar.g.setText(playerResponseModel.x());
        jeqVar.h.setText(zhq.i(playerResponseModel.a()));
        jeqVar.i.setBackgroundResource(R.drawable.bg_video_thumb);
        jeqVar.a.j(jeqVar.j, playerResponseModel.b(), ajjv.b);
        jeqVar.f.setOnClickListener(new View.OnClickListener() { // from class: jen
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jgk jgkVar2 = jgk.this;
                jgo jgoVar = jgkVar2.a;
                PlayerResponseModel playerResponseModel2 = jgkVar2.b;
                adlm adlmVar = jgoVar.e;
                if (adlmVar == null) {
                    zga.m(jgo.a, "MDx session is null, not handling auto play video request.");
                    return;
                }
                adld c = adle.c();
                c.f(playerResponseModel2.y());
                adlmVar.M(c.a());
            }
        });
    }
}
