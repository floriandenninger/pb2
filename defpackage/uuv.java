package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uuv extends aonm implements aooz {
    public static final uuv a;
    private static volatile aopf k;
    public int b;
    public babf c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;
    public babg j;
    private byte l = 2;
    public String i = "";

    static {
        uuv uuvVar = new uuv();
        a = uuvVar;
        aonm.registerDefaultInstance(uuv.class, uuvVar);
    }

    private uuv() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005စ\u0004\u0006င\u0005\u0007ဈ\u0006\tᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new uuv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (uuv.class) {
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
