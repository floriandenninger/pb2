package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arjb extends aonm implements aooz {
    public static final arjb a;
    private static volatile aopf g;
    public int b;
    public apxf d;
    public ariy e;
    public aony f;
    private arnd h;
    private aota i;
    private asah j;
    private arjv k;
    private asfc l;
    private byte m = 2;
    public aomf c = aomf.b;

    static {
        arjb arjbVar = new arjb();
        a = arjbVar;
        aonm.registerDefaultInstance(arjb.class, arjbVar);
    }

    private arjb() {
        emptyProtobufList();
        emptyProtobufList();
        this.f = aonm.emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0014\t\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ည\u0002\rᐉ\n\u000eᐉ\u000b\u000fᐉ\f\u0010ᐉ\u0007\u0012ᐉ\u000f\u0014\u001a", new Object[]{"b", "h", "i", "c", "j", "k", "l", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new arjb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (arjb.class) {
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
