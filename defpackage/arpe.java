package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arpe extends aonm implements aooz {
    public static final arpe a;
    private static volatile aopf i;
    public arnd b;
    public int c;
    public boolean e;
    public boolean h;
    private int j;
    private byte k = 2;
    public String d = "";
    public aomf f = aomf.b;
    public aony g = emptyProtobufList();

    static {
        arpe arpeVar = new arpe();
        a = arpeVar;
        aonm.registerDefaultInstance(arpe.class, arpeVar);
    }

    private arpe() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ည\u0004\u0006\u001b\u000bဇ\t", new Object[]{"j", "b", "c", aqtk.t, "d", "e", "f", "g", arpc.class, "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arpe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (arpe.class) {
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
