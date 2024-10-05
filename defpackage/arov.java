package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arov extends aonm implements aooz {
    public static final arov a;
    private static volatile aopf m;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public long i;
    public long j;
    public int k;
    public aony l = emptyProtobufList();

    static {
        arov arovVar = new arov();
        a = arovVar;
        aonm.registerDefaultInstance(arov.class, arovVar);
    }

    private arov() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0002\u0003ဋ\u0001\u0006ဇ\u0004\u0007င\u0005\u000bဂ\n\fဂ\u000b\rဌ\f\u000e\u001b\u000fင\u0006", new Object[]{"b", "c", "e", "d", "f", "g", "i", "j", "k", atmj.h, "l", arou.class, "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arov();
            case NEW_BUILDER:
                return new aone((float[]) null, (byte[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (arov.class) {
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
