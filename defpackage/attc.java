package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class attc extends aonm implements aooz {
    public static final attc a;
    private static volatile aopf i;
    public int b;
    public aqyg c;
    public long d;
    public apxf e;
    public arfs f;
    public boolean g;
    private aota j;
    private byte k = 2;
    public aomf h = aomf.b;

    static {
        attc attcVar = new attc();
        a = attcVar;
        aonm.registerDefaultInstance(attc.class, attcVar);
    }

    private attc() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ဂ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ᐉ\u0005\u0007ည\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "j", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new attc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (attc.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
