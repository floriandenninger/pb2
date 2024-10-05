package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajyo {
    public final Context a;
    public final ajvb b;
    public final ajsa c;
    public final ajrz d;
    public final SpannableStringBuilder e;
    public ajyv f;
    public EditText g;
    public boolean h;
    public View i;
    public boolean j;
    private final ajoq k;
    private final ajsg l;
    private TextWatcher m;

    public ajyo(Context context, ajvb ajvbVar, ajsa ajsaVar, ajut ajutVar, ajsd ajsdVar, ajoq ajoqVar) {
        this.a = context;
        ajsaVar.getClass();
        this.c = ajsaVar;
        ajvbVar.getClass();
        this.b = ajvbVar;
        ajvbVar.a(ajyv.class);
        this.k = ajoqVar;
        ajym ajymVar = new ajym(this);
        this.l = ajymVar;
        this.d = new ajrz(context, ajutVar, ajsdVar, true, ajymVar, true);
        this.e = new SpannableStringBuilder();
    }

    private static final int a(int i, int i2) {
        if (i < i2) {
            return i2 - i;
        }
        return 0;
    }

    public final int b(CharSequence charSequence, int i) {
        int a;
        int a2;
        String trim = charSequence.toString().trim();
        if (TextUtils.isEmpty(trim) || !this.c.h() || i <= 0) {
            return trim.length();
        }
        Matcher matcher = this.c.f().matcher(trim);
        int length = trim.length();
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (matcher.find()) {
            if (matcher.start() > i2) {
                if (!z) {
                    a2 = a(i2, matcher.start());
                } else {
                    a2 = a(length, matcher.start());
                }
                a = i3 + a2;
                i2 = matcher.start();
            } else {
                a = i3 + a(i2, matcher.start());
            }
            i3 = a + i;
            length = matcher.end();
            z = true;
        }
        if (z) {
            return length < trim.length() ? i3 + a(length, trim.length()) : i3;
        }
        return trim.length();
    }

    public final TextWatcher c(EditText editText) {
        this.g = editText;
        if (this.m == null) {
            this.m = new ajyn(this, this);
        }
        return this.m;
    }

    public final void d() {
        View view = this.i;
        if (view != null) {
            view.setVisibility(8);
        }
        this.h = false;
    }

    public final void e(Editable editable) {
        Pattern f = this.c.f();
        if (f == null || TextUtils.isEmpty(editable.toString())) {
            return;
        }
        Matcher matcher = f.matcher(editable.toString());
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            if (((ImageSpan[]) editable.getSpans(matcher.start(), matcher.end(), ImageSpan.class)).length == 0) {
                if (arrayList.contains(Integer.valueOf(matcher.start()))) {
                    return;
                }
                arrayList.add(Integer.valueOf(matcher.start()));
                String d = this.c.d(matcher.group());
                this.e.clear();
                this.d.e();
                this.d.a(this.c.e(d), this.c.b(d), this.a.getResources().getDimension(R.dimen.emoji_height), d, this.g.getId(), this.e, null);
            }
        }
    }

    public final void f(ViewGroup viewGroup, aqsv aqsvVar, EditText editText, final ajyu ajyuVar) {
        this.g = editText;
        editText.setOnTouchListener(new View.OnTouchListener() { // from class: ajyl
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ajyo ajyoVar = ajyo.this;
                ajyu ajyuVar2 = ajyuVar;
                if (!ajyoVar.h || ajyuVar2 == null) {
                    return false;
                }
                ajyuVar2.na();
                return false;
            }
        });
        if (aqsvVar != null) {
            ajyv ajyvVar = (ajyv) this.k.b(viewGroup);
            this.f = ajyvVar;
            ajyvVar.e = editText;
            ajyvVar.d = ajyuVar;
            this.i = ajyvVar.b;
            ajok ajokVar = new ajok();
            ajokVar.f("VIEW_POOL_KEY", this.b.get());
            ajokVar.f("CONTROLLER_KEY", this);
            this.f.oB(ajokVar, aqsvVar);
            whu.C(this.i);
            this.i.setVisibility(0);
            this.h = true;
            return;
        }
        d();
    }
}
