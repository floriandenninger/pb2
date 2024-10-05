package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ardz extends aonm implements aooz {
    public static final ardz a;
    private static volatile aopf g;
    public int b;
    public int c;
    public int d;
    private int h;
    private byte i = 2;
    public aony e = emptyProtobufList();
    public aony f = emptyProtobufList();

    static {
        ardz ardzVar = new ardz();
        a = ardzVar;
        aonm.registerDefaultInstance(ardz.class, ardzVar);
    }

    private ardz() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0002\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004Л\u0005Л", new Object[]{"h", "b", "c", "d", "e", aulq.class, "f", aulq.class});
            case NEW_MUTABLE_INSTANCE:
                return new ardz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (ardz.class) {
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
