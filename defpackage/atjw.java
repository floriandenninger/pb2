package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atjw extends aonm implements aooz {
    public static final atjw a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private apxf e;
    private aota f;
    private byte g = 2;

    static {
        atjw atjwVar = new atjw();
        a = atjwVar;
        aonm.registerDefaultInstance(atjw.class, atjwVar);
    }

    private atjw() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0004ᐉ\u0004\u0005ᐉ\u0005", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new atjw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atjw.class) {
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
