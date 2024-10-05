package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aozy extends aonm implements aooz {
    public static final aozy a;
    public static final aonk b;
    private static volatile aopf g;
    public apxf c;
    public apxf d;
    public int e;
    public int f;
    private int h;
    private byte i = 2;

    static {
        aozy aozyVar = new aozy();
        a = aozyVar;
        aonm.registerDefaultInstance(aozy.class, aozyVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, aozyVar, aozyVar, null, 387215479, aoqn.MESSAGE, aozy.class);
    }

    private aozy() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"h", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aozy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aozy.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
