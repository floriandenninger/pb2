package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atlg extends aonm implements aooz {
    public static final atlg a;
    private static volatile aopf b;
    private int c;
    private aulq d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private apxf h;
    private apxf i;
    private aulq j;
    private aulq k;
    private aulq l;
    private aulq m;
    private aulq n;
    private aulq o;
    private aulq p;
    private aota q;
    private byte r = 2;

    static {
        atlg atlgVar = new atlg();
        a = atlgVar;
        aonm.registerDefaultInstance(atlg.class, atlgVar);
    }

    private atlg() {
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u0018\u000e\u0000\u0000\u000e\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0010\bᐉ\u000b\nᐉ\u0004\u000bᐉ\b\u0010ᐉ\u0006\u0011ᐉ\t\u0014ᐉ\u0007\u0016ᐉ\n\u0017ᐉ\f\u0018ᐉ\u000e", new Object[]{"c", "d", "e", "f", "h", "q", "n", "g", "k", "i", "l", "j", "m", "o", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new atlg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atlg.class) {
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
