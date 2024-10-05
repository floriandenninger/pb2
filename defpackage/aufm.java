package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aufm extends aonm implements aooz {
    public static final aufm a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aufn h;
    private aulq i;
    private aulq j;
    private aulq k;
    private aulq l;
    private aulq m;
    private aota n;
    private aulq o;
    private aulq p;
    private byte q = 2;

    static {
        aufm aufmVar = new aufm();
        a = aufmVar;
        aonm.registerDefaultInstance(aufm.class, aufmVar);
    }

    private aufm() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u001f\r\u0000\u0000\r\u0001ᐉ\u0000\u0003ᐉ\r\u000bᐉ\f\u000eᐉ\u0011\u000fᐉ\u000e\u0015ᐉ\u0002\u0016ᐉ\u0005\u0017ᐉ\u0006\u001aᐉ\u000f\u001bᐉ\u0012\u001cᐉ\u0013\u001dᐉ\t\u001fᐉ\u000b", new Object[]{"c", "d", "k", "j", "n", "l", "e", "f", "g", "m", "o", "p", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aufm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aufm.class) {
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
