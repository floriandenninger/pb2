package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jci extends ahus {
    public int a;
    public int b;
    public String c;
    private Optional d;
    private Optional e;

    public jci(Context context) {
        super(context);
        this.a = 0;
        this.d = Optional.empty();
        this.e = Optional.empty();
    }

    @Override // defpackage.ahuy
    public final View a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.remote_control_status, (ViewGroup) null);
        this.d = Optional.of((YouTubeTextView) inflate.findViewById(R.id.message));
        this.e = Optional.of((ProgressBar) inflate.findViewById(R.id.progressbar));
        return inflate;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final void d(final Context context, View view) {
        this.d.ifPresent(new Consumer() { // from class: jch
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                String string;
                jci jciVar = jci.this;
                Context context2 = context;
                YouTubeTextView youTubeTextView = (YouTubeTextView) obj;
                whu.I(youTubeTextView, jciVar.a != 0);
                if (TextUtils.isEmpty(jciVar.c)) {
                    string = context2.getString(jciVar.b);
                } else {
                    string = context2.getString(jciVar.b, jciVar.c);
                }
                youTubeTextView.setText(string);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
        this.e.ifPresent(new Consumer() { // from class: jcg
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                whu.I((ProgressBar) obj, jci.this.a == 2);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ahus
    public final void kV() {
        this.a = 0;
        super.kV();
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return this.a != 0;
    }
}
