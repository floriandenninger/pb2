package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'h' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiuw {
    public static final aiuw a;
    public static final aiuw b;
    public static final aiuw c;
    public static final aiuw d;
    public static final aiuw e;
    public static final aiuw f;
    public static final aiuw g;
    public static final aiuw h;
    private static final /* synthetic */ aiuw[] j;
    public final int i;
    private final aiuv k;
    private Typeface l;

    static {
        aiuw aiuwVar = new aiuw("MONOSPACED_SERIF", 0, 0, c("fonts/MonoSerif-Regular.ttf"));
        a = aiuwVar;
        aiuw aiuwVar2 = new aiuw("PROPORTIONAL_SERIF", 1, 1, b(Typeface.create("serif", 0)));
        b = aiuwVar2;
        aiuw aiuwVar3 = new aiuw("MONOSPACED_SANS_SERIF", 2, 2, b(Typeface.create("monospace", 0)));
        c = aiuwVar3;
        aiuw aiuwVar4 = new aiuw("PROPORTIONAL_SANS_SERIF", 3, 3, b(Typeface.create("sans-serif", 0)));
        d = aiuwVar4;
        aiuw aiuwVar5 = new aiuw("CASUAL", 4, 4, c("fonts/ComingSoon-Regular.ttf"));
        e = aiuwVar5;
        aiuw aiuwVar6 = new aiuw("CURSIVE", 5, 5, c("fonts/DancingScript-Regular.ttf"));
        f = aiuwVar6;
        aiuw aiuwVar7 = new aiuw("SMALL_CAPITALS", 6, 6, c("fonts/CarroisGothicSC-Regular.ttf"));
        g = aiuwVar7;
        final ajct ajctVar = ajct.ROBOTO_MEDIUM;
        ajctVar.getClass();
        aiuw aiuwVar8 = new aiuw("INLINE_MUTED", 7, 8, new aiuv() { // from class: aiut
            @Override // defpackage.aiuv
            public final Typeface a(Context context) {
                return ajct.this.a(context);
            }
        });
        h = aiuwVar8;
        j = new aiuw[]{aiuwVar, aiuwVar2, aiuwVar3, aiuwVar4, aiuwVar5, aiuwVar6, aiuwVar7, aiuwVar8};
    }

    private aiuw(String str, int i, int i2, aiuv aiuvVar) {
        this.i = i2;
        this.k = aiuvVar;
    }

    private static aiuv b(final Typeface typeface) {
        return new aiuv() { // from class: aius
            @Override // defpackage.aiuv
            public final Typeface a(Context context) {
                Typeface typeface2 = typeface;
                aiuw aiuwVar = aiuw.a;
                return typeface2;
            }
        };
    }

    private static aiuv c(final String str) {
        return new aiuv() { // from class: aiuu
            @Override // defpackage.aiuv
            public final Typeface a(Context context) {
                String str2 = str;
                aiuw aiuwVar = aiuw.a;
                return Typeface.createFromAsset(context.getAssets(), str2);
            }
        };
    }

    public static aiuw[] values() {
        return (aiuw[]) j.clone();
    }

    public static Typeface a(Context context, SubtitlesStyle subtitlesStyle) {
        int i = subtitlesStyle.f;
        if (i == 7) {
            return ((CaptioningManager) context.getSystemService("captioning")).getUserStyle().getTypeface();
        }
        aiuw[] values = values();
        for (int i2 = 0; i2 < values.length; i2++) {
            aiuw aiuwVar = values[i2];
            if (aiuwVar.i == i) {
                if (aiuwVar.l == null) {
                    aiuwVar.l = aiuwVar.k.a(context);
                }
                return values[i2].l;
            }
        }
        return null;
    }
}
