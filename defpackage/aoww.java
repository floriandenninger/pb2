package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoww extends aonm implements aooz {
    public static final aoww a;
    private static volatile aopf d;
    public Object c;
    private int e;
    private aota f;
    public int b = 0;
    private byte g = 2;

    static {
        aoww aowwVar = new aoww();
        a = aowwVar;
        aonm.registerDefaultInstance(aoww.class, aowwVar);
    }

    private aoww() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\t\u0003\u0000\u0000\u0001\u0001ွ\u0000\u0006ᐉ\u0002\tျ\u0000", new Object[]{"c", "b", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aoww();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aoww.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
