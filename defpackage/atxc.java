package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atxc extends aonm implements aooz {
    public static final atxc a;
    public static final aonk b;
    private static volatile aopf m;
    public int c;
    public long g;
    public long h;
    public String d = "";
    public aomf e = aomf.b;
    public String f = "";
    public String i = "";
    public aony j = aonm.emptyProtobufList();
    public String k = "";
    public String l = "";

    static {
        atxc atxcVar = new atxc();
        a = atxcVar;
        aonm.registerDefaultInstance(atxc.class, atxcVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, atxcVar, atxcVar, null, 119, aoqn.MESSAGE, atxc.class);
    }

    private atxc() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဂ\u0003\u0004ဈ\u0005\u0005\u001a\u0006ဈ\u0006\u0007ဈ\u0007\bဈ\u0002\tဂ\u0004", new Object[]{"c", "d", "e", "g", "i", "j", "k", "l", "f", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new atxc();
            case NEW_BUILDER:
                return new aone((short[][][]) null, (float[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (atxc.class) {
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
