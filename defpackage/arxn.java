package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arxn extends aonm implements aooz {
    public static final arxn a;
    private static volatile aopf i;
    public int b;
    public arnd c;
    public aryi d;
    public apxf e;
    public long f;
    public arya g;
    private byte j = 2;
    public aomf h = aomf.b;

    static {
        arxn arxnVar = new arxn();
        a = arxnVar;
        aonm.registerDefaultInstance(arxn.class, arxnVar);
    }

    private arxn() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006ᐉ\u0004\u0007ဂ\u0005\bဉ\u0006\nည\b", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arxn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (arxn.class) {
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
