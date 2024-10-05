package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.youtube.metadataeditor.elements.suggest.MdeSuggestBottomSheetController$CandidateChipSpan;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afmv implements TextWatcher, afnk {
    public final afmr a;
    public boolean b;
    public ArrayList c;
    public afnl d;
    Map e;
    public List f;
    public List g;
    final boolean h;
    private final Handler i;
    private ajtg[] j;
    private boolean k;
    private final Context l;
    private final szl m;
    private final syd n;
    private final sxc o;
    private final acra p;
    private final awnw q;
    private final sww r;
    private ArrayList s;
    private CoordinatorLayout t;
    private final boolean u;
    private final ajyw v;

    public afmv(Context context, afmr afmrVar, szl szlVar, syd sydVar, sxc sxcVar, acra acraVar, awnw awnwVar, sww swwVar, boolean z, boolean z2, ajyw ajywVar, afnp afnpVar, akpq akpqVar, List list, List list2, boolean z3, byte[] bArr) {
        afmv afmvVar = this;
        afmvVar.i = new Handler(Looper.getMainLooper());
        afmvVar.l = context;
        afmvVar.a = afmrVar;
        afmvVar.m = szlVar;
        afmvVar.n = sydVar;
        afmvVar.o = sxcVar;
        afmvVar.p = acraVar;
        afmvVar.q = awnwVar;
        afmvVar.r = swwVar;
        afmvVar.b = z;
        afmvVar.v = ajywVar;
        afmvVar.f = list;
        afmvVar.g = list2;
        HashMap hashMap = new HashMap();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            awuf awufVar = (awuf) it.next();
            if (awufVar.c.equals("@")) {
                afmvVar = this;
            } else {
                akpj akpjVar = new akpj();
                akpp a = akpqVar.a(Collections.singletonList(akpjVar));
                a.c = awufVar.d;
                ajoy ajoyVar = (ajoy) afnpVar.a.get();
                ajoyVar.getClass();
                ajvb ajvbVar = (ajvb) afnpVar.b.get();
                ajvbVar.getClass();
                ajvq ajvqVar = (ajvq) afnpVar.c.get();
                ajvqVar.getClass();
                ypa ypaVar = (ypa) afnpVar.d.get();
                ypaVar.getClass();
                ajxj ajxjVar = (ajxj) afnpVar.e.get();
                ajxjVar.getClass();
                acqz acqzVar = (acqz) afnpVar.f.get();
                acqzVar.getClass();
                zaw zawVar = (zaw) afnpVar.g.get();
                zawVar.getClass();
                aaea aaeaVar = (aaea) afnpVar.h.get();
                Iterator it2 = it;
                aaeaVar.getClass();
                aypn aypnVar = (aypn) afnpVar.i.get();
                aypnVar.getClass();
                akpq akpqVar2 = (akpq) afnpVar.j.get();
                akpqVar2.getClass();
                acpz acpzVar = (acpz) afnpVar.k.get();
                HashMap hashMap2 = hashMap;
                acpzVar.getClass();
                ajkn ajknVar = (ajkn) afnpVar.l.get();
                ajknVar.getClass();
                context.getClass();
                afno afnoVar = new afno(ajoyVar, ajvbVar, ajvqVar, ypaVar, ajxjVar, acqzVar, zawVar, aaeaVar, aypnVar, akpqVar2, acpzVar, ajknVar, context, akpjVar, a, null);
                if (awufVar.e) {
                    try {
                        ((akpp) afnoVar.a.a).a("", true).get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
                hashMap2.put(awufVar.c, new afmw(afnoVar));
                afmvVar = this;
                hashMap = hashMap2;
                it = it2;
            }
        }
        afmvVar.e = hashMap;
        afmvVar.u = z2;
        afmvVar.h = z3;
    }

    private final void c(awuf awufVar) {
        if (this.h) {
            Activity l = yjj.l(this.a.b.b);
            ViewGroup viewGroup = (ViewGroup) l.getWindow().findViewById(R.id.interstitials_container);
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                afmo afmoVar = new afmo(this.a.b.b);
                afmoVar.setLayoutParams(new ahh(viewGroup.getLayoutParams()));
                l.getLayoutInflater().inflate(R.layout.social_suggestions_bottom_sheet, afmoVar);
                viewGroup.addView(afmoVar);
                ViewGroup viewGroup2 = (ViewGroup) afmoVar.findViewById(R.id.social_suggestions_bottom_sheet_container);
                aong aongVar = (aong) apxf.a.createBuilder();
                aongVar.e(UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.userMentionSuggestionsEndpoint, UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.a);
                apxf apxfVar = (apxf) aongVar.build();
                afnm afnmVar = this.e.containsKey(awufVar.c) ? ((afmw) this.e.get(awufVar.c)).a : null;
                ajyw ajywVar = this.v;
                afmr afmrVar = this.a;
                acra acraVar = this.p;
                avuu avuuVar = avuu.USER_MENTION_AUTO_COMPLETE_SOURCE_STUDIO;
                boolean z = this.u;
                Context context = (Context) ajywVar.a.get();
                context.getClass();
                alor alorVar = (alor) ajywVar.b.get();
                alorVar.getClass();
                afqp afqpVar = (afqp) ajywVar.c.get();
                afqpVar.getClass();
                afmrVar.getClass();
                viewGroup2.getClass();
                apxfVar.getClass();
                acraVar.getClass();
                avuuVar.getClass();
                afnl afnlVar = new afnl(context, alorVar, afqpVar, afmoVar, afmrVar, awufVar, viewGroup2, acraVar, avuuVar, afnmVar, z, null, null);
                this.d = afnlVar;
                afmoVar.i = afnlVar;
                this.t = afmoVar;
                this.d.q = this;
                this.i.post(new afmu(this, 2));
            }
        }
    }

    final awuf a(Editable editable, int i) {
        List list = this.g;
        if (list != null && !list.isEmpty()) {
            for (awuf awufVar : this.g) {
                String str = awufVar.c;
                if (i >= str.length() && str.contentEquals(editable.subSequence(i - str.length(), i))) {
                    return awufVar;
                }
            }
            return null;
        }
        List<String> list2 = this.f;
        if (list2 == null) {
            return null;
        }
        for (String str2 : list2) {
            if (i >= str2.length() && str2.contentEquals(editable.subSequence(i - str2.length(), i))) {
                aone createBuilder = awuf.a.createBuilder();
                createBuilder.copyOnWrite();
                awuf awufVar2 = (awuf) createBuilder.instance;
                str2.getClass();
                awufVar2.b |= 1;
                awufVar2.c = str2;
                return (awuf) createBuilder.build();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        int i;
        final Editable editable2 = editable;
        int i2 = 1;
        if (editable2 == null || editable.length() == 0) {
            this.j = null;
            this.k = false;
            this.i.post(new afmu(this, 1));
            return;
        }
        ajtg[] ajtgVarArr = this.j;
        if (ajtgVarArr != null) {
            if (this.k) {
                for (ajtg ajtgVar : ajtgVarArr) {
                    this.i.post(new afmt(editable2, ajtgVar, 0));
                }
            } else {
                for (ajtg ajtgVar2 : ajtgVarArr) {
                    editable2.removeSpan(ajtgVar2);
                }
            }
        }
        if (this.b) {
            final int length = editable.length();
            while (true) {
                length--;
                if (length < 0) {
                    break;
                } else if (editable2.charAt(length) == '\n') {
                    final int i3 = length + 1;
                    this.i.post(new Runnable() { // from class: afms
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = length;
                            Editable editable3 = editable2;
                            int i5 = i3;
                            if (i4 > editable3.length() || i5 > editable3.length()) {
                                return;
                            }
                            editable3.delete(i4, i5);
                        }
                    });
                }
            }
        }
        if (this.c != null && (editable2 instanceof SpannableStringBuilder)) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) editable2;
            ArrayList arrayList = this.s;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    spannableStringBuilder.removeSpan(arrayList.get(i4));
                }
            }
            this.s = new ArrayList();
            ArrayList arrayList2 = this.c;
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                awuc awucVar = (awuc) arrayList2.get(i5);
                Pattern compile = Pattern.compile(awucVar.b);
                String spannableStringBuilder2 = spannableStringBuilder.toString();
                Matcher matcher = compile.matcher(editable2);
                int i6 = 0;
                while (true) {
                    i = i5 + 1;
                    if (matcher.find()) {
                        String group = matcher.group();
                        int indexOf = spannableStringBuilder2.indexOf(group, i6);
                        aone createBuilder = awnd.a.createBuilder();
                        createBuilder.copyOnWrite();
                        awnd awndVar = (awnd) createBuilder.instance;
                        awndVar.b |= i2;
                        awndVar.c = "a";
                        awnh awnhVar = awucVar.c;
                        if (awnhVar == null) {
                            awnhVar = awnh.a;
                        }
                        createBuilder.copyOnWrite();
                        awnd awndVar2 = (awnd) createBuilder.instance;
                        awnhVar.getClass();
                        aony aonyVar = awndVar2.f;
                        if (!aonyVar.c()) {
                            awndVar2.f = aonm.mutableCopy(aonyVar);
                        }
                        awndVar2.f.add(awnhVar);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(aflm.b(this.o, this.l, (awnd) createBuilder.build(), this.r, this.m, this.n));
                        for (Object obj : spannableStringBuilder3.getSpans(0, spannableStringBuilder3.length(), Object.class)) {
                            this.s.add(obj);
                            spannableStringBuilder.setSpan(obj, indexOf, group.length() + indexOf, 33);
                        }
                        i6 = indexOf + group.length();
                        i2 = 1;
                    }
                }
                editable2 = editable;
                i5 = i;
            }
        }
        if (this.a.b != null) {
            z = false;
            this.i.post(new afmu(this, 0 == true ? 1 : 0));
        } else {
            z = false;
        }
        this.j = null;
        this.k = z;
    }

    public final void b() {
        CoordinatorLayout coordinatorLayout;
        ViewGroup viewGroup = (ViewGroup) yjj.l(this.a.b.b).getWindow().findViewById(R.id.interstitials_container);
        if (viewGroup == null || (coordinatorLayout = this.t) == null) {
            return;
        }
        viewGroup.removeView(coordinatorLayout);
        this.t.removeAllViews();
        this.d = null;
        this.t = null;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence == null || charSequence.length() == 0 || !(charSequence instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        if (i2 > 0) {
            this.j = (ajtg[]) spanned.getSpans(i, i2 + i, ajtg.class);
            this.k = true;
            return;
        }
        if (i3 <= 0 || i <= 0 || i >= spanned.length()) {
            return;
        }
        ajtg[] ajtgVarArr = (ajtg[]) spanned.getSpans(i - 1, i, ajtg.class);
        ajtg[] ajtgVarArr2 = (ajtg[]) spanned.getSpans(i, i + 1, ajtg.class);
        if (ajtgVarArr == null || ajtgVarArr.length == 0 || ajtgVarArr2 == null || ajtgVarArr2.length == 0 || !ajtgVarArr[0].b.contentEquals(ajtgVarArr2[0].b)) {
            return;
        }
        this.j = ajtgVarArr2;
        this.k = false;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        awuf a;
        awnw awnwVar = this.q;
        if (awnwVar != null) {
            this.r.b(awnwVar, afmx.b(this.a)).Q();
        }
        if (this.d != null) {
            awuf a2 = a(this.a.getText(), this.a.getSelectionStart());
            if (a2 != null) {
                if (!a2.equals(this.d.r) || !afmx.a.contains(a2.c)) {
                    if (a2.c.equals("@") && this.d.r.c.equals("#")) {
                        this.d.a();
                        c(a2);
                    }
                } else {
                    afnl afnlVar = this.d;
                    if (afnlVar.l != null) {
                        afnlVar.b.getText().removeSpan(afnlVar.l);
                    }
                    int selectionStart = afnlVar.b.getSelectionStart();
                    afnlVar.l = new MdeSuggestBottomSheetController$CandidateChipSpan();
                    afnlVar.b.getText().setSpan(afnlVar.l, selectionStart - afnlVar.r.c.length(), selectionStart, 34);
                }
            }
            this.d.c();
            return;
        }
        if (this.v != null) {
            int selectionStart2 = this.a.getSelectionStart();
            if ((selectionStart2 != this.a.getSelectionEnd() || selectionStart2 > 0) && (a = a(this.a.getText(), selectionStart2)) != null) {
                c(a);
            }
        }
    }
}
