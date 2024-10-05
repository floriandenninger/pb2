package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asqw extends aonm implements aooz {
    public static final asqw a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private apxf e;
    private aulq f;
    private aulq g;
    private aota h;
    private byte i = 2;

    static {
        asqw asqwVar = new asqw();
        a = asqwVar;
        aonm.registerDefaultInstance(asqw.class, asqwVar);
    }

    private asqw() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\u000b\u0005\u0000\u0000\u0005\u0003ᐉ\u0002\u0005ᐉ\u0006\u0006ᐉ\t\nᐉ\u0007\u000bᐉ\b", new Object[]{"c", "d", "e", "h", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new asqw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (asqw.class) {
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
