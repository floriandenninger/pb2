package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hye {
    public final Context a;
    public final Executor b;
    private final Object d = new Object();
    public amru c = amru.q();
    private final Map e = new HashMap();
    private final Map f = new HashMap();

    public hye(Context context, Executor executor) {
        this.a = context;
        this.b = executor;
    }

    public static final int c() {
        return alr.b().a();
    }

    public final amru a(String str) {
        String str2 = (String) this.f.get(str);
        if (this.e.get(str2) == null) {
            return amru.q();
        }
        return amru.o((Collection) this.e.get(str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (c() == 1) {
            try {
                ArrayList arrayList = new ArrayList();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.a.getResources().openRawResource(R.raw.emoji_list_with_variations), amme.c));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        arrayList.add(readLine);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    List h = amnm.c(",").h((String) it.next());
                    int i = 0;
                    als alsVar = null;
                    hyd hydVar = new hyd((String) h.get(0), (String) h.get(1), (h.size() != 3 || ((String) h.get(2)).isEmpty()) ? null : (String) h.get(2));
                    if (hydVar.a()) {
                        this.f.put(hydVar.a, hydVar.c);
                        if (this.e.get(hydVar.c) == null) {
                            this.e.put(hydVar.c, new ArrayList());
                        }
                        ((List) this.e.get(hydVar.c)).add(hydVar.a);
                    }
                    if (!hydVar.a() || hydVar.b.equals(hydVar.c)) {
                        String str = hydVar.a;
                        alr b = alr.b();
                        gn.d(b.e(), "Not initialized yet");
                        alv alvVar = ((alk) b.e).a;
                        alu aluVar = new alu(alvVar.a.b, alvVar.b, alvVar.c);
                        int length = str.length();
                        while (true) {
                            if (i < length) {
                                int codePointAt = Character.codePointAt(str, i);
                                if (aluVar.a(codePointAt) != 2) {
                                    break;
                                } else {
                                    i += Character.charCount(codePointAt);
                                }
                            } else if (aluVar.d()) {
                                alsVar = aluVar.b();
                            }
                        }
                        if (alsVar != null) {
                            arrayList2.add(hydVar.a);
                        }
                    }
                }
                synchronized (this.d) {
                    this.c = amru.o(arrayList2);
                }
                return;
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                afsi.b(2, 9, valueOf.length() != 0 ? "VideoFX: Reading emoji from device failed ".concat(valueOf) : new String("VideoFX: Reading emoji from device failed "));
                return;
            }
        }
        afsi.b(2, 9, "VideoFX: Reading emoji from device failed");
    }
}
