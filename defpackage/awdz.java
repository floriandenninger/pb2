package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awdz extends aonm implements aooz {
    public static final awdz a;
    private static volatile aopf f;
    public int b;
    public int d;
    private apxf g;
    private byte h = 2;
    public String c = "";
    public String e = "";

    static {
        awdz awdzVar = new awdz();
        a = awdzVar;
        aonm.registerDefaultInstance(awdz.class, awdzVar);
    }

    private awdz() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဋ\u0001\u0004ဈ\u0002\u0006ᐉ\u0004", new Object[]{"b", "c", "d", "e", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new awdz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awdz.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
