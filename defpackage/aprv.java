package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aprv extends aonm implements aooz {
    public static final aprv a;
    private static volatile aopf k;
    public int b;
    public aqyg d;
    public long g;
    public aqyg i;
    private byte l = 2;
    public String c = "";
    public String e = "";
    public String f = "";
    public String h = "";
    public aony j = emptyProtobufList();

    static {
        aprv aprvVar = new aprv();
        a = aprvVar;
        aonm.registerDefaultInstance(aprv.class, aprvVar);
    }

    private aprv() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0003\u0001ဈ\u0000\u0002ᐉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0006\u0007ဈ\u0007\bᐉ\b\tЛ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", aprx.class});
            case NEW_MUTABLE_INSTANCE:
                return new aprv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (aprv.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
