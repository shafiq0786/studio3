 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
import org.eclipse.core.runtime.IStatus;

		log(MessageFormat.format(
				"Took {0}ms to parse out {1} diffs", (System.currentTimeMillis() - start), files.size())); //$NON-NLS-1$
			IStatus result = gitCommit.repository().executeWithGitSSH(GitRepository.ReadWrite.READ,
			return parse(gitCommit, new StringReader(result.getMessage()));