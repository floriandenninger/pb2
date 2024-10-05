package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atzz extends aonm implements aooz {
    public static final atzz a;
    private static volatile aopf f;
    public int b;
    public aqsz c;
    public aqsy d;
    public aqrf e;
    private aowo g;
    private byte h = 2;

    static {
        atzz atzzVar = new atzz();
        a = atzzVar;
        aonm.registerDefaultInstance(atzz.class, atzzVar);
    }

    private atzz() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\uf478ᬽ\ue2e3斄\u0004\u0000\u0000\u0004\uf478ᬽᐉ\u0001\uf5f9ᭀᐉ\u0000\uf492䤳ᐉ\u0003\ue2e3斄ᐉ\u0002", new Object[]{"b", "d", "c", "e", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new atzz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (atzz.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
