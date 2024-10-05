package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpb extends aonm implements aooz {
    public static final atpb a;
    private static volatile aopf d;
    public int b;
    private atpc e;
    private byte f = 2;
    public String c = "";

    static {
        atpb atpbVar = new atpb();
        a = atpbVar;
        aonm.registerDefaultInstance(atpb.class, atpbVar);
    }

    private atpb() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0001\u0002ဈ\u0001\u0004ᐉ\u0003", new Object[]{"b", "c", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new atpb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (atpb.class) {
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
