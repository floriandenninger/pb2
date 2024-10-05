package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afmr extends sp {
    public ArrayList a;
    public dhe b;
    public boolean c;
    public aakv d;
    public String e;
    public boolean f;
    public Map g;
    public awnw h;
    public sww i;
    public boolean j;
    private ayqx k;
    private Context l;
    private ajrz m;

    public afmr(Context context) {
        super(context);
    }

    private final ArrayList f() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        return this.a;
    }

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        f().add(textWatcher);
        super.addTextChangedListener(textWatcher);
    }

    public final void b() {
        ArrayList f = f();
        int size = f.size();
        for (int i = 0; i < size; i++) {
            TextWatcher textWatcher = (TextWatcher) f.get(i);
            if (textWatcher instanceof afmv) {
                ((afmv) textWatcher).b();
            }
            super.removeTextChangedListener(textWatcher);
        }
        f.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(aqss aqssVar) {
        if (aqssVar.e.size() > 0) {
            String str = (String) aqssVar.e.get(0);
            this.g.put(str, aqssVar);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ajrz ajrzVar = this.m;
            avgg avggVar = aqssVar.f;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajrzVar.a(str, avggVar, this.l.getResources().getDimension(R.dimen.emoji_height), aqssVar.d, getId(), spannableStringBuilder, null);
        }
    }

    public final void d(Context context, ajut ajutVar, ajsd ajsdVar, awue awueVar) {
        this.f = true;
        this.l = context;
        this.g = new HashMap();
        this.m = new ajrz(context, ajutVar, ajsdVar, true, new afmq(this), true);
        if (awueVar.v.size() > 0) {
            for (int i = 0; i < awueVar.v.size(); i++) {
                aqss aqssVar = ((awts) awueVar.v.get(i)).e;
                if (aqssVar == null) {
                    aqssVar = aqss.a;
                }
                c(aqssVar);
            }
        }
    }

    public final void e(aakv aakvVar, ayqi ayqiVar, awnw awnwVar, sww swwVar) {
        this.d = aakvVar;
        this.h = awnwVar;
        this.i = swwVar;
        this.e = aalt.f(avau.b.a(), "");
        ayqx ayqxVar = this.k;
        if (ayqxVar != null && !ayqxVar.e()) {
            ayrz.c((AtomicReference) this.k);
        }
        this.k = null;
        this.k = aakvVar.h(this.e, false).ab(ayqiVar).ax(new ayrs() { // from class: afmp
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aakt aaktVar;
                afmr afmrVar = afmr.this;
                aakz aakzVar = (aakz) obj;
                if (aakzVar == null || (aaktVar = aakzVar.c) == null) {
                    return;
                }
                avat avatVar = (avat) aaktVar;
                avav avavVar = avav.SUGGEST_EDITABLE_TEXT_ACTION_UNKNOWN;
                int ordinal = avatVar.getAction().ordinal();
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        afmrVar.dispatchKeyEvent(new KeyEvent(0, 67));
                    }
                } else if (afmrVar.f && avatVar.b.d == 3) {
                    aqss emoji = avatVar.getEmoji();
                    if (emoji.e.size() > 0) {
                        String str = (String) emoji.e.get(0);
                        if (afmrVar.getSelectionStart() < 0 || afmrVar.getSelectionEnd() < 0) {
                            afmrVar.getEditableText().insert(afmrVar.getText().length(), str);
                        } else {
                            afmrVar.getEditableText().replace(afmrVar.getSelectionStart(), afmrVar.getSelectionEnd(), str);
                        }
                        afmrVar.c(emoji);
                    }
                } else if (avatVar.b.d == 2) {
                    String text = avatVar.getText();
                    boolean booleanValue = avatVar.getShouldConditionallyPrependWhitespace().booleanValue();
                    if (avatVar.getShouldAppendWhitespace().booleanValue()) {
                        text = String.valueOf(text).concat(" ");
                    }
                    int selectionStart = afmrVar.getSelectionStart() >= 0 ? afmrVar.getSelectionStart() : afmrVar.getText().length() + 1;
                    int selectionEnd = afmrVar.getSelectionEnd() >= 0 ? afmrVar.getSelectionEnd() : 1 + afmrVar.getText().length();
                    if (booleanValue && selectionStart > 0) {
                        if (" \n\r-_".indexOf(afmrVar.getText().charAt(selectionStart - 1)) == -1) {
                            String valueOf = String.valueOf(text);
                            text = valueOf.length() != 0 ? " ".concat(valueOf) : new String(" ");
                        }
                    }
                    afmrVar.getEditableText().replace(selectionStart, selectionEnd, text);
                }
                aalc c = afmrVar.d.c();
                c.g(afmrVar.e);
                c.b().Q();
                awnw awnwVar2 = afmrVar.h;
                if (awnwVar2 != null) {
                    afmrVar.i.b(awnwVar2, afmx.b(afmrVar)).Q();
                }
            }
        });
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.c && i == 66) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        f().remove(textWatcher);
        super.removeTextChangedListener(textWatcher);
    }
}
