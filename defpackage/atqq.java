package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atqq extends aonm implements aooz {
    public static final atqq a;
    private static volatile aopf m;
    public int b;
    public Object d;
    public int f;
    public int g;
    public int h;
    public int j;
    public aomf k;
    public atpg l;
    public int c = 0;
    private byte n = 2;
    public String e = "";
    public String i = "";

    static {
        atqq atqqVar = new atqq();
        a = atqqVar;
        aonm.registerDefaultInstance(atqq.class, atqqVar);
    }

    private atqq() {
        aomf aomfVar = aomf.b;
        this.k = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0001\u0001\u0001\u000f\n\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0005ဌ\u0003\u0006ဈ\u0004\u0007ᐼ\u0000\u000bဌ\t\fည\n\rဉ\u000b\u000fြ\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", atqp.a, "i", atqo.class, "j", atnn.p, "k", "l", atpf.class});
            case NEW_MUTABLE_INSTANCE:
                return new atqq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (atqq.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
