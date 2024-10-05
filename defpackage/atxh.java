package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atxh extends aonm implements aooz {
    private static final atxh a;
    private static volatile aopf b;
    private int c;
    private int d;
    private atxf e;
    private int f;
    private String g = "";
    private int h;

    static {
        atxh atxhVar = new atxh();
        a = atxhVar;
        aonm.registerDefaultInstance(atxh.class, atxhVar);
    }

    private atxh() {
    }

    public static atxg a() {
        return (atxg) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        this.c |= 8;
        this.g = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(aqjw aqjwVar) {
        this.f = aqjwVar.B;
        this.c |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(atxk atxkVar) {
        this.h = atxkVar.p;
        this.c |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(atxl atxlVar) {
        this.d = atxlVar.f;
        this.c |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(atxf atxfVar) {
        atxfVar.getClass();
        this.e = atxfVar;
        this.c |= 2;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{"c", "d", atxl.a(), "e", "f", aqjw.a(), "g", "h", atxk.a()});
            case NEW_MUTABLE_INSTANCE:
                return new atxh();
            case NEW_BUILDER:
                return new atxg();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atxh.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
