package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aueo extends aonm implements aooz {
    public static final aueo a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private apxf e;
    private aqyg f;
    private aulq g;
    private aulq h;
    private aulq i;
    private aqyg j;
    private aqyg k;
    private aulq l;
    private aulq m;
    private aulq n;
    private aota o;
    private aulq p;
    private apxf q;
    private byte r = 2;

    static {
        aueo aueoVar = new aueo();
        a = aueoVar;
        aonm.registerDefaultInstance(aueo.class, aueoVar);
    }

    private aueo() {
        aomf aomfVar = aomf.b;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0003\u0017\u000e\u0000\u0000\u000e\u0003ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\n\u000eᐉ\r\u000fᐉ\u000e\u0011ᐉ\u000f\u0014ᐉ\u0011\u0016ᐉ\u0014\u0017ᐉ\u0015", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new aueo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aueo.class) {
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
