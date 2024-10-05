package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arwu extends aonm implements aooz {
    public static final arwu a;
    private static volatile aopf i;
    public int b;
    public long d;
    public boolean f;
    public long g;
    public long h;
    public String c = "";
    public aony e = aonm.emptyProtobufList();

    static {
        arwu arwuVar = new arwu();
        a = arwuVar;
        aonm.registerDefaultInstance(arwu.class, arwuVar);
    }

    private arwu() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003\u001a\u0004ဇ\u0002\u0005ဂ\u0003\u0006ဂ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arwu();
            case NEW_BUILDER:
                return new aone((float[][][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (arwu.class) {
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
