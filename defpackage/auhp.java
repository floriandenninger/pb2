package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auhp extends aonm implements aooz {
    public static final auhp a;
    private static volatile aopf n;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public apxf f;
    public aulq h;
    public long i;
    public apln j;
    public augn l;
    public aulq m;
    private byte o = 2;
    public aony g = emptyProtobufList();
    public aony k = emptyProtobufList();

    static {
        auhp auhpVar = new auhp();
        a = auhpVar;
        aonm.registerDefaultInstance(auhp.class, auhpVar);
    }

    private auhp() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005Л\u0006ᐉ\u0004\u0007ဂ\u0005\bဉ\u0006\tЛ\nဉ\u0007\u000bᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g", apxf.class, "h", "i", "j", "k", apxf.class, "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new auhp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (auhp.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
