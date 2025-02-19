package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ChangedPackages;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.VersionedPackage;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.UserHandle;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
class ypp extends PackageManager {
    protected final PackageManager a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ypp(PackageManager packageManager) {
        this.a = packageManager;
    }

    @Override // android.content.pm.PackageManager
    public final void addPackageToPreferred(String str) {
        this.a.addPackageToPreferred(str);
    }

    @Override // android.content.pm.PackageManager
    public final boolean addPermission(PermissionInfo permissionInfo) {
        return this.a.addPermission(permissionInfo);
    }

    @Override // android.content.pm.PackageManager
    public final boolean addPermissionAsync(PermissionInfo permissionInfo) {
        return this.a.addPermissionAsync(permissionInfo);
    }

    @Override // android.content.pm.PackageManager
    public final void addPreferredActivity(IntentFilter intentFilter, int i, ComponentName[] componentNameArr, ComponentName componentName) {
        this.a.addPreferredActivity(intentFilter, i, componentNameArr, componentName);
    }

    @Override // android.content.pm.PackageManager
    public final boolean canRequestPackageInstalls() {
        return this.a.canRequestPackageInstalls();
    }

    @Override // android.content.pm.PackageManager
    public final String[] canonicalToCurrentPackageNames(String[] strArr) {
        return this.a.canonicalToCurrentPackageNames(strArr);
    }

    @Override // android.content.pm.PackageManager
    public final int checkPermission(String str, String str2) {
        return this.a.checkPermission(str, str2);
    }

    @Override // android.content.pm.PackageManager
    public final int checkSignatures(int i, int i2) {
        return this.a.checkSignatures(i, i2);
    }

    @Override // android.content.pm.PackageManager
    public final void clearInstantAppCookie() {
        this.a.clearInstantAppCookie();
    }

    @Override // android.content.pm.PackageManager
    public final void clearPackagePreferredActivities(String str) {
        this.a.clearPackagePreferredActivities(str);
    }

    @Override // android.content.pm.PackageManager
    public final String[] currentToCanonicalPackageNames(String[] strArr) {
        return this.a.currentToCanonicalPackageNames(strArr);
    }

    @Override // android.content.pm.PackageManager
    public final void extendVerificationTimeout(int i, int i2, long j) {
        this.a.extendVerificationTimeout(i, i2, j);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityBanner(ComponentName componentName) {
        return this.a.getActivityBanner(componentName);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityIcon(ComponentName componentName) {
        return this.a.getActivityIcon(componentName);
    }

    @Override // android.content.pm.PackageManager
    public final ActivityInfo getActivityInfo(ComponentName componentName, int i) {
        return this.a.getActivityInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityLogo(ComponentName componentName) {
        return this.a.getActivityLogo(componentName);
    }

    @Override // android.content.pm.PackageManager
    public final List getAllPermissionGroups(int i) {
        return this.a.getAllPermissionGroups(i);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationBanner(ApplicationInfo applicationInfo) {
        return this.a.getApplicationBanner(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final int getApplicationEnabledSetting(String str) {
        return this.a.getApplicationEnabledSetting(str);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationIcon(ApplicationInfo applicationInfo) {
        return this.a.getApplicationIcon(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final ApplicationInfo getApplicationInfo(String str, int i) {
        return this.a.getApplicationInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getApplicationLabel(ApplicationInfo applicationInfo) {
        return this.a.getApplicationLabel(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationLogo(ApplicationInfo applicationInfo) {
        return this.a.getApplicationLogo(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final ChangedPackages getChangedPackages(int i) {
        return this.a.getChangedPackages(i);
    }

    @Override // android.content.pm.PackageManager
    public final int getComponentEnabledSetting(ComponentName componentName) {
        return this.a.getComponentEnabledSetting(componentName);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getDefaultActivityIcon() {
        return this.a.getDefaultActivityIcon();
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getDrawable(String str, int i, ApplicationInfo applicationInfo) {
        return this.a.getDrawable(str, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final List getInstalledApplications(int i) {
        return this.a.getInstalledApplications(i);
    }

    @Override // android.content.pm.PackageManager
    public final List getInstalledPackages(int i) {
        return this.a.getInstalledPackages(i);
    }

    @Override // android.content.pm.PackageManager
    public final String getInstallerPackageName(String str) {
        return this.a.getInstallerPackageName(str);
    }

    @Override // android.content.pm.PackageManager
    public final byte[] getInstantAppCookie() {
        return this.a.getInstantAppCookie();
    }

    @Override // android.content.pm.PackageManager
    public final int getInstantAppCookieMaxBytes() {
        return this.a.getInstantAppCookieMaxBytes();
    }

    @Override // android.content.pm.PackageManager
    public final InstrumentationInfo getInstrumentationInfo(ComponentName componentName, int i) {
        return this.a.getInstrumentationInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    public final Intent getLaunchIntentForPackage(String str) {
        return this.a.getLaunchIntentForPackage(str);
    }

    @Override // android.content.pm.PackageManager
    public final Intent getLeanbackLaunchIntentForPackage(String str) {
        return this.a.getLeanbackLaunchIntentForPackage(str);
    }

    @Override // android.content.pm.PackageManager
    public final String getNameForUid(int i) {
        return this.a.getNameForUid(i);
    }

    @Override // android.content.pm.PackageManager
    public final int[] getPackageGids(String str) {
        return this.a.getPackageGids(str);
    }

    @Override // android.content.pm.PackageManager
    public final PackageInfo getPackageInfo(VersionedPackage versionedPackage, int i) {
        return this.a.getPackageInfo(versionedPackage, i);
    }

    @Override // android.content.pm.PackageManager
    public final PackageInstaller getPackageInstaller() {
        return this.a.getPackageInstaller();
    }

    @Override // android.content.pm.PackageManager
    public final int getPackageUid(String str, int i) {
        return this.a.getPackageUid(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final String[] getPackagesForUid(int i) {
        return this.a.getPackagesForUid(i);
    }

    @Override // android.content.pm.PackageManager
    public final List getPackagesHoldingPermissions(String[] strArr, int i) {
        return this.a.getPackagesHoldingPermissions(strArr, i);
    }

    @Override // android.content.pm.PackageManager
    public final PermissionGroupInfo getPermissionGroupInfo(String str, int i) {
        return this.a.getPermissionGroupInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final PermissionInfo getPermissionInfo(String str, int i) {
        return this.a.getPermissionInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final int getPreferredActivities(List list, List list2, String str) {
        return this.a.getPreferredActivities(list, list2, str);
    }

    @Override // android.content.pm.PackageManager
    public final List getPreferredPackages(int i) {
        return this.a.getPreferredPackages(i);
    }

    @Override // android.content.pm.PackageManager
    public final ProviderInfo getProviderInfo(ComponentName componentName, int i) {
        return this.a.getProviderInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    public final ActivityInfo getReceiverInfo(ComponentName componentName, int i) {
        return this.a.getReceiverInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForActivity(ComponentName componentName) {
        return this.a.getResourcesForActivity(componentName);
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForApplication(ApplicationInfo applicationInfo) {
        return this.a.getResourcesForApplication(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final ServiceInfo getServiceInfo(ComponentName componentName, int i) {
        return this.a.getServiceInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    public final List getSharedLibraries(int i) {
        return this.a.getSharedLibraries(i);
    }

    @Override // android.content.pm.PackageManager
    public final FeatureInfo[] getSystemAvailableFeatures() {
        return this.a.getSystemAvailableFeatures();
    }

    @Override // android.content.pm.PackageManager
    public final String[] getSystemSharedLibraryNames() {
        return this.a.getSystemSharedLibraryNames();
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getText(String str, int i, ApplicationInfo applicationInfo) {
        return this.a.getText(str, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getUserBadgedDrawableForDensity(Drawable drawable, UserHandle userHandle, Rect rect, int i) {
        return this.a.getUserBadgedDrawableForDensity(drawable, userHandle, rect, i);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getUserBadgedIcon(Drawable drawable, UserHandle userHandle) {
        return this.a.getUserBadgedIcon(drawable, userHandle);
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getUserBadgedLabel(CharSequence charSequence, UserHandle userHandle) {
        return this.a.getUserBadgedLabel(charSequence, userHandle);
    }

    @Override // android.content.pm.PackageManager
    public final XmlResourceParser getXml(String str, int i, ApplicationInfo applicationInfo) {
        return this.a.getXml(str, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final boolean hasSystemFeature(String str) {
        return this.a.hasSystemFeature(str);
    }

    @Override // android.content.pm.PackageManager
    public final boolean isInstantApp() {
        return this.a.isInstantApp();
    }

    @Override // android.content.pm.PackageManager
    public final boolean isPermissionRevokedByPolicy(String str, String str2) {
        return this.a.isPermissionRevokedByPolicy(str, str2);
    }

    @Override // android.content.pm.PackageManager
    public final boolean isSafeMode() {
        return this.a.isSafeMode();
    }

    @Override // android.content.pm.PackageManager
    public final List queryBroadcastReceivers(Intent intent, int i) {
        return this.a.queryBroadcastReceivers(intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final List queryContentProviders(String str, int i, int i2) {
        return this.a.queryContentProviders(str, i, i2);
    }

    @Override // android.content.pm.PackageManager
    public final List queryInstrumentation(String str, int i) {
        return this.a.queryInstrumentation(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final List queryIntentActivities(Intent intent, int i) {
        return this.a.queryIntentActivities(intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final List queryIntentActivityOptions(ComponentName componentName, Intent[] intentArr, Intent intent, int i) {
        return this.a.queryIntentActivityOptions(componentName, intentArr, intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final List queryIntentContentProviders(Intent intent, int i) {
        return this.a.queryIntentContentProviders(intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final List queryIntentServices(Intent intent, int i) {
        return this.a.queryIntentServices(intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final List queryPermissionsByGroup(String str, int i) {
        return this.a.queryPermissionsByGroup(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final void removePackageFromPreferred(String str) {
        this.a.removePackageFromPreferred(str);
    }

    @Override // android.content.pm.PackageManager
    public final void removePermission(String str) {
        this.a.removePermission(str);
    }

    @Override // android.content.pm.PackageManager
    public final ResolveInfo resolveActivity(Intent intent, int i) {
        return this.a.resolveActivity(intent, i);
    }

    @Override // android.content.pm.PackageManager
    public ProviderInfo resolveContentProvider(String str, int i) {
        return this.a.resolveContentProvider(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final ResolveInfo resolveService(Intent intent, int i) {
        return this.a.resolveService(intent, i);
    }

    @Override // android.content.pm.PackageManager
    public final void setApplicationCategoryHint(String str, int i) {
        this.a.setApplicationCategoryHint(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final void setApplicationEnabledSetting(String str, int i, int i2) {
        this.a.setApplicationEnabledSetting(str, i, i2);
    }

    @Override // android.content.pm.PackageManager
    public final void setComponentEnabledSetting(ComponentName componentName, int i, int i2) {
        this.a.setComponentEnabledSetting(componentName, i, i2);
    }

    @Override // android.content.pm.PackageManager
    public final void setInstallerPackageName(String str, String str2) {
        this.a.setInstallerPackageName(str, str2);
    }

    @Override // android.content.pm.PackageManager
    public final void updateInstantAppCookie(byte[] bArr) {
        this.a.updateInstantAppCookie(bArr);
    }

    @Override // android.content.pm.PackageManager
    public final void verifyPendingInstall(int i, int i2) {
        this.a.verifyPendingInstall(i, i2);
    }

    @Override // android.content.pm.PackageManager
    public final int checkSignatures(String str, String str2) {
        return this.a.checkSignatures(str, str2);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityBanner(Intent intent) {
        return this.a.getActivityBanner(intent);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityIcon(Intent intent) {
        return this.a.getActivityIcon(intent);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityLogo(Intent intent) {
        return this.a.getActivityLogo(intent);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationBanner(String str) {
        return this.a.getApplicationBanner(str);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationIcon(String str) {
        return this.a.getApplicationIcon(str);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationLogo(String str) {
        return this.a.getApplicationLogo(str);
    }

    @Override // android.content.pm.PackageManager
    public final int[] getPackageGids(String str, int i) {
        return this.a.getPackageGids(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final PackageInfo getPackageInfo(String str, int i) {
        return this.a.getPackageInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForApplication(String str) {
        return this.a.getResourcesForApplication(str);
    }

    @Override // android.content.pm.PackageManager
    public final boolean hasSystemFeature(String str, int i) {
        return this.a.hasSystemFeature(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final boolean isInstantApp(String str) {
        return this.a.isInstantApp(str);
    }
}
